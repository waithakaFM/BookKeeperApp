package com.room.ps.bookkeeper

import androidx.room.TypeConverter
import java.util.*
import java.util.logging.LogManager

class DataTypeConverter {

    @TypeConverter
    fun toDate(value: Long?): Date? {
        return if (value == null) null else Date(value)
    }

    @TypeConverter
    fun toLong(value: Date?): Long?{
        return value?.time
    }
}