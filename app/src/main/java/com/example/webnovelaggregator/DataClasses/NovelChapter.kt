package com.example.webnovelaggregator.DataClasses

public class NovelChapter(val chapterName:String, val chapterID:String, val chapterStatus:ChapterStatus){
    var isLoaded:Boolean = false
    var chapterText:String =  ""
    public fun get_chapter_content():String{
        return chapterText
    }
    public fun load_chapter(loaded_text:String){
        isLoaded = true
        chapterText = loaded_text
    }

}