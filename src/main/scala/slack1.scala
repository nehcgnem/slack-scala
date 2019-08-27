
import slack.api.SlackApiClient
import slack.api.BlockingSlackApiClient
import akka.actor.ActorSystem
import vegas._
import java.io.File

import vegas.render.WindowRenderer._
import java.nio.file.{Files, Paths}

import scala.concurrent.ExecutionContext

//REF：
//https://github.com/slack-scala-client/slack-scala-client/blob/master/src/main/scala/slack/api/BlockingSlackApiClient.scala#L28-L324

object slack1 {
  val token = "xoxp-692855199414-679295005154-739139132112-22fa8bedfef0002be6a4708a2744de27"
  val client = BlockingSlackApiClient(token)
  implicit val system = ActorSystem("slack")
  implicit val ec = ExecutionContext.global
  client.postChatMessage("general", "hello")
  def main(args: Array[String]): Unit = {
    println("hell0")



    val plot = Vegas("Country Pop").
      withData(
        Seq(
          Map("country" -> "USA", "population" -> 314),
          Map("country" -> "UK", "population" -> 64),
          Map("country" -> "DK", "population" -> 80)
        )
      ).
      encodeX("country", Nom).
      encodeY("population", Quant).
      mark(Bar)

    val myObj = new File("C:/Users/megchen/Pictures/R0000114.jpg")
    client.uploadFile(myObj)

  }

}
