package com.ru.waka.app.controllers

import org.json4s.{DefaultFormats, Formats}

class TopController extends BaseController {
  protected implicit val jsonFormats: Formats = DefaultFormats.withBigDecimal

  get("/") {
    "{\"message\": \"Hello World\"}"
  }

  get("/json") {
    TopController.Hoge("aaa")
  }
}

object TopController {
  case class Hoge(a: String)
}
