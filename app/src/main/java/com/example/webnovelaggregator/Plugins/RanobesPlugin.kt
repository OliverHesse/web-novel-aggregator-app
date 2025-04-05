package com.example.webnovelaggregator.Plugins

import com.example.webnovelaggregator.DataClasses.Novel
import org.jsoup.Jsoup

class RanobesPlugin : Plugin() {
    override fun get_novel(name: String): Novel? {
        var doc = Jsoup.parse("")
        TODO("Not yet implemented")
    }

    override fun get_novels(numberOfNovels: Int, novelOffset: Int): List<Novel> {
        //loads novels into memory
        var mutableNovelList = mutableListOf<Novel>()
        if(numberOfNovels <= 0){
            return mutableNovelList.toList();
        }
        //by default they load 10
        var novelsLeft = numberOfNovels
        while(novelsLeft > 0){
            var doc = Jsoup.parse("https://ranobes.top/novels/")
            //to remove warning for now
            novelsLeft -=1
        }

        TODO("Not yet implemented")
    }
}