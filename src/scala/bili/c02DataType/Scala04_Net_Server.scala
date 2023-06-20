package scala.bili.c02DataType

import java.io.InputStream
import java.net.{ServerSocket, Socket}


/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/16
 */

object Scala04_Net_Server {

  def main(args: Array[String]): Unit = {

    //TODO Create Server

    // !!!!!!网络通信没办法传输对象、数字这样的内容
    //        可以传递字节码，将对象转换为字节码， <---序列化
    //                     将字节码转换为对象， <--- 反序列化
    // 用java的socket、ServerSocket
    val server = new ServerSocket(9999)
    println("Server activated, waiting for CLIENT conenction")
    val client : Socket = server.accept()
    val in : InputStream =  client.getInputStream
    val result : Int = in.read()
    println("Recieve data form Client : " + result)
    // 注意：server收到数据是244 (ASCII字节码，-256) （网络通信没法传object、数字）
    in.close()
    client.close()
    server.close()
    
  }
}
