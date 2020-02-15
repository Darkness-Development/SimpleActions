package MyNotifications

import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class MyBalloonMsg: AnAction() {
    override fun actionPerformed(e: AnActionEvent) {

        val myBalloon = NotificationGroup("simpleActions.myBalloon", NotificationDisplayType.BALLOON, true)
        myBalloon.createNotification("Balloon Title", "Balloon text", NotificationType.INFORMATION, null)
            .notify(e.project)

    }

}