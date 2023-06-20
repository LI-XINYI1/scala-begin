package scala.bili.c02DataType

import java.net.ServerSocket
import java.net.Socket
import java.io.OutputStream

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/16
 */

object Scala04_Net_Client {

  def main(args: Array[String]): Unit = {

    //TODO 建立server的链接

    val server = new Socket("localhost",9999)
    println("Connect to server, try to send data to server")
    val out: OutputStream = server.getOutputStream
    out.write(500)
    out.close()
    println("Try to send data to server, 500")
    server.close()


    
  }
}
