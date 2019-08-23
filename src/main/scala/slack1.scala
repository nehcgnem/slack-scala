
import slack.api.SlackApiClient          // Async
import slack.api.BlockingSlackApiClient  // Blocking
import akka.actor.ActorSystem

import java.nio.file.{Files, Paths}

//REF：
//https://github.com/slack-scala-client/slack-scala-client/blob/master/src/main/scala/slack/api/BlockingSlackApiClient.scala#L28-L324

object slack1 {
  val token = "xoxp-692855199414-679295005154-723123930086-9a40af5ff4e04742b33f374a8d2e1481"
  val client = BlockingSlackApiClient(token)
  implicit val system = ActorSystem("slack")
  client.postChatMessage("general", "hello")
  def main(args: Array[String]): Unit = {
    println("hell0")
  }

}
