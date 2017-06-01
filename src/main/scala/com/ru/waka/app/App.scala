package com.ru.waka.app

class App extends AppStack {

  get("/") {
    com.ru.waka.html.index.render()
  }
}
