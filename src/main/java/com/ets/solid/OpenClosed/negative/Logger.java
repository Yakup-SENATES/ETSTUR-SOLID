package com.ets.solid.OpenClosed.negative;

public class Logger {

    /*
    gelen her özellikte bu kod uzayacaktır.
    bu sebepten her enum için kendi loglarını yazmalıyız.
     */

        public boolean log(String message, LogType logType) {
            if (logType == LogType.XML) {
                XmlLog xmlLog = new XmlLog();
                return xmlLog.Log(message);
            } else if (logType == LogType.DB) {
                DbLog dbLog = new DbLog();
                return dbLog.log(message);
            }
            return false;
        }

}
