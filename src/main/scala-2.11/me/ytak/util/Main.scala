package me.ytak.util

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.{Parent, Scene}
import javafx.stage.Stage


object Main extends App {
  Application.launch(classOf[Main], args: _*)
}

class Main extends Application {
  override def start(primaryStage: Stage): Unit = {
    val loader = new FXMLLoader(getClass.getResource("main.fxml"))
    loader.setController(MainController)
    val root: Parent = loader.load()

    val scene = new Scene(root, 800, 500)
    primaryStage.setTitle("GUI test")
    primaryStage.setScene(scene)
    primaryStage.show()
  }
}

