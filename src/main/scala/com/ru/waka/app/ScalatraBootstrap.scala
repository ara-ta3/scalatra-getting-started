package com.ru.waka.app

import com.ru.waka.app.controllers.App
import javax.servlet.ServletContext
import org.scalatra._

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new App, "/*")
  }
}
