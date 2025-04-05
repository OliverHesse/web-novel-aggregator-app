package com.example.webnovelaggregator.Plugins

import com.example.webnovelaggregator.DataClasses.Novel

abstract class Plugin {
    abstract fun get_novel(name:String):Novel?
    abstract fun get_novels(numberOfNovels:Int=-1,novelOffset:Int = 0):List<Novel>
}