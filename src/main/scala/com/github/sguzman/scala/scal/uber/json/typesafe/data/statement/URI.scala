package com.github.sguzman.scala.scal.uber.json.typesafe.data.statement

case class URI(
              protocol: String,
              slashes: Boolean,
              auth: Option[String],
              host: String,
              port: String,
              hostname: String,
              hash: Option[String],
              search: String,
              query: String,
              pathname: String,
              path: String,
              href: String
              )

