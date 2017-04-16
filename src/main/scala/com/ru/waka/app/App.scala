package com.ru.waka.app

class App extends HogeStack {

  get("/") {
    com.ru.waka.html.index.render()
  }
}
