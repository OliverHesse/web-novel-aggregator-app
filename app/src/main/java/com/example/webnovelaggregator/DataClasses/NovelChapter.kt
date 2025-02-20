package com.example.webnovelaggregator.DataClasses

import android.text.BoringLayout

public class NovelChapter(val chapterName:String,val chapterID:String,val chapterStatus:ChapterState,val chapterDownloaded:Boolean,val chapterContent:ChapterContent){


    public fun get_chapter_content():ChapterContent{
        return chapterContent
    }

    public fun load_chapter(rawText:String):ChapterContent{
        chapterContent.load_chapter_content(rawText)
        return chapterContent
    }

}