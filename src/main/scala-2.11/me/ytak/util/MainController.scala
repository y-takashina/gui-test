package me.ytak.util

import javafx.fxml.FXML
import javafx.scene.control.{Button, Label}
import javafx.scene.input.MouseEvent

/**
  * Created by ytakashina on 2016/11/08.
  */
object MainController {
  @FXML
  private[this] var button1: Button = _
  @FXML
  private[this] var label1: Label = _

  @FXML
  private[this] def button1_MouseClicked(e: MouseEvent): Unit = {
    label1.setText("Hello, world!")
  }
}
