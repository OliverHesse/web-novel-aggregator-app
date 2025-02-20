package com.example.webnovelaggregator.Plugins

import com.example.webnovelaggregator.DataClasses.Novel

interface Plugin {
    fun get_novel(name:String):Novel?
    fun get_novels(numberOfNovels:Int=-1,novelOffset:Int = 0):List<Novel>
}