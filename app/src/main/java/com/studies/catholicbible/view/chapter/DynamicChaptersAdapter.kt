package com.studies.catholicbible.view.chapter

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.studies.catholicbible.view.chapter.verses.DynamicVerseFragment

class DynamicChaptersAdapter(private val fragments: ArrayList<DynamicVerseFragment>,
                             fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): DynamicVerseFragment = fragments[position]

    override fun getCount(): Int = fragments.size
}