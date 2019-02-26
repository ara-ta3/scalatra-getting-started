package com.ru.waka.app.controllers

import org.json4s.{DefaultFormats, Formats}

class App extends AppStack {
  protected implicit val jsonFormats: Formats = DefaultFormats.withBigDecimal

  get("/") {
    "{\"message\": \"Hello World\"}"
  }

  get("/json") {
    App.Hoge("aaa")
  }
}

object App {
  case class Hoge(a: String)
}
