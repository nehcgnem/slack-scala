import slack.api.SlackApiClient
import slack.api.BlockingSlackApiClient
import akka.actor.ActorSystem

import scala.concurrent._
import org.sameersingh.scalaplot.Implicits._
import java.io.File


//REF：
//https://github.com/slack-scala-client/slack-scala-client/blob/master/src/main/scala/slack/api/BlockingSlackApiClient.scala#L28-L324

object slack1 {

  def main(args: Array[String])  {
    println("hell0")
    val token = "xoxp-692855199414-679295005154-757310763600-74fe2d16be33411b7ec0987893782adf"
    val client = SlackApiClient(token)
    implicit val system = ActorSystem("slack")
        client.postChatMessage("general", "hello from home")
    println("hell0")


    //    val x = 0.0 until 2.0 * math.Pi by 0.1
//    output(ASCII, xyChart(x -> (math.sin(_), math.cos(_))))
//
//    output(PNG("/home/ubun/Documents/", "test"), xyChart(x -> (math.sin(_), math.cos(_))))
//    val file = new File("/home/ubun/Documents/test.png")
//    client.uploadFile(Left(file), "png", "test image", "test image", "no comment", Seq("images"))

  }

}
