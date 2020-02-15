/*
 * Copyright (c) 2020.  Darkness Development.
 *
 * # Released under MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package MyNotifications

import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class MyBalloonMsg: AnAction() {

    override fun update(e: AnActionEvent) {
        super.update(e)
        // Below code added for action to be 100% enabled
        // As there is a ?bug? but for default it`s shown but
        // in disabled state.
        e.presentation.isEnabled = true

    }

    override fun actionPerformed(e: AnActionEvent) {

        val myBalloon = NotificationGroup("simpleActions.myBalloon", NotificationDisplayType.BALLOON, true)
        myBalloon.createNotification("Balloon Title", "Balloon text", NotificationType.INFORMATION, null)
            .notify(e.project)

    }

}