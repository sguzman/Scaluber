package com.github.sguzman.scala.scal.uber.json.typesafe.login.email.output

case class Question(
                   `type`: String,
                   tripChallenges: Array[String],
                   siginToken: String,
                   thirdPartyInfo: ThirdPartyInfo,
                   identifiedUserInfo: IdentifiedUserInfo
                   )
