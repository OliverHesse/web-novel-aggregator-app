package com.example.webnovelaggregator.DataClasses

public class ChapterContent(var isLoaded:Boolean = false){
    var rawText:String = ""
    constructor(rawText:String) : this(true) {
        //process the rawText here
    }

    fun load_chapter_content(rawTextData: String){
        isLoaded = true
        rawText = rawTextData
        //just format the text properly so it complies with
    }
}