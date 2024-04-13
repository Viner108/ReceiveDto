package org.example

import android.graphics.Color
import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.receivedto.R
import org.example.tank.dto.TankDto
import java.io.ObjectInputStream
import java.net.Socket

class MainActivity : AppCompatActivity() {
    private lateinit var containerView: ViewGroup
    private val tankDtoMap = mutableMapOf<Int, View>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.setBackgroundColor(Color.rgb(164, 191, 51))
        setContentView(R.layout.activity_main)

        containerView = findViewById(R.id.containerView)

    }

    fun getDto(view: View) {
        val socketClientTask = SocketClientTask()
        socketClientTask.execute()
    }

    inner class SocketClientTask : AsyncTask<Void, TankDto, Unit>() {

        override fun doInBackground(vararg params: Void?) {
            val serverIp = "192.168.1.102"
            val serverPortInput = 8002
            val serverPortOutput = 8001
            val socketInput = Socket(serverIp, serverPortInput)
            val socketOutput = Socket(serverIp, serverPortOutput)
            val inputStream = ObjectInputStream(socketInput.getInputStream())

            try {
                while (true) {
                    val dto = inputStream.readObject() as Any
                    if(dto is TankDto) {
                        publishProgress(dto)
                    }
                }
            } catch (e: Exception) {
                Log.e("SocketClientTask", "Error receiving DTO", e)
            } finally {
                inputStream.close()
                socketInput.close()
            }
        }

        override fun onProgressUpdate(vararg values: TankDto?) {
            values.forEach { dto ->
                dto?.let {
                    updateTank(dto)
                }
            }
        }
    }
    private fun updateTank(dto: TankDto) {
        runOnUiThread {
            val existingView = tankDtoMap[dto.id]
            existingView?.let {
                containerView.removeView(it)
            }
            val tankView = createTankView(dto)
            containerView.addView(tankView)
            tankDtoMap[dto.id] = tankView
        }
    }

    private fun createTankView(dto: TankDto): View {
        val tankImageView = ImageView(this@MainActivity)
        tankImageView.setImageResource(R.drawable.tank_active)
        val layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        tankImageView.x = dto.x.toFloat()
        tankImageView.y = dto.y.toFloat()
        return tankImageView
    }

}