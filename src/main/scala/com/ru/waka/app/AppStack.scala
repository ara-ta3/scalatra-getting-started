package com.ru.waka.app

import org.scalatra.ScalatraServlet
import org.scalatra.json.JacksonJsonSupport


trait AppStack extends ScalatraServlet with JacksonJsonSupport{
  before() {
    contentType = formats("json")
  }

  notFound {
    halt(404, "{}")
  }
}
