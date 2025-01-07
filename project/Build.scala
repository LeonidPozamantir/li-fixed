import play.sbt.PlayImport._
import sbt._, Keys._

trait Resolvers {
  val codahale = "repo.codahale.com" at "http://repo.codahale.com/"
  //val twitter = "twitter.com" at "http://maven.twttr.com/"
  val typesafe = "typesafe.com" at "http://repo.typesafe.com/typesafe/releases/"
  val iliaz = "iliaz.com" at "http://scala.iliaz.com/"
  val sonatype = "sonatype" at "http://oss.sonatype.org/content/repositories/releases"
}

object Dependencies {
  val twitterUtilVersion = "1.12.12"

  val twitterCore = "com.twitter" % "util-core" % twitterUtilVersion
  val slf4jNop = "org.slf4j" % "slf4j-nop" % "1.6.4"
  val scalaz = "org.scalaz" %% "scalaz-core" % "7.3.8"
  val specs2 = "org.specs2" %% "specs2" % "1.8"
  val redis = "net.debasishg" %% "redisclient" % "2.4.2"
  val json = "net.liftweb" %% "lift-json" % "2.4-RC1"
  val casbah = "com.mongodb.casbah" %% "casbah" % "2.1.5-1"
  val salat = "com.novus" %% "salat-core" % "0.0.8-SNAPSHOT"
}

