package com.training

import com.amazonaws.services.lambda.runtime.Context

class LogEvent {
    def log(event: Object, context: Context): String = {
        context.getLogger.log(event.toString)
        event.toString
    }
}
