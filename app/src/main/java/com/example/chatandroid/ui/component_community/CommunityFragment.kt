package com.example.chatandroid.ui.component_community

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.chatandroid.R
import io.noties.markwon.Markwon

class CommunityFragment(contentLayoutId: Int) : Fragment(contentLayoutId) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val content = "RecyclerView是Android开发中的一种新的视图组，它被设计出来主要是为了替代ListView和GridView，并且在实现瀑布流布局等更为高级和灵活的布局方式上有更大的优势。\n" +
                "RecyclerView的特点在于其提供的复用机制更为高效，实现了管理与视图的解耦合。这意味着它能够有效地处理大量数据，而且在数据的增加和减少时，能自动调整并保持流畅的滚动效果。\n" +
                "基础使用RecyclerView，首先需要在XML布局文件中定义RecyclerView，并指定LayoutManager和ItemDecoration等组件。在Java或Kotlin代码中，我们可以通过findViewById或recyclerViewOf方法获取RecyclerView实例，然后设置LayoutManager，ItemDecoration和ItemAnimator等组件。\n" +
                "使用RecyclerView的过程大致可以分为以下步骤：\n" +
                "1. 在XML布局文件中添加RecyclerView：\n" +
                "```xml\n" +
                "<androidx.recyclerview.widget.RecyclerView\n" +
                "         android:id=\"@+id/my_recycler_view\"\n" +
                "         android:layout_width=\"match_parent\"\n" +
                "         android:layout_height=\"match_parent\"\n" +
                "         app:layoutManager=\"androidx.recyclerview.widget.LinearLayoutManager\"\n" +
                "         app:addItemDecoration=\"@androidx.recyclerview.widget.ItemDecorationStyle.Builder.addItemDecoration\"/>\n" +
                " ```\n" +
                " 2. 在Java或Kotlin代码中获取RecyclerView实例，设置LayoutManager和其他组件：\n" +
                " ```java\n" +
                "RecyclerView recyclerView = findViewById(R.id.my_recycler_view);\n" +
                "recyclerView.setLayoutManager(new LinearLayoutManager(this));\n" +
                "recyclerView.setAdapter(new MyAdapter());\n" +
                " ```\n" +
                "在以上代码中，MyAdapter是需要自定义的适配器类，用来管理数据的显示。\n" +
                "以上就是Android的RecyclerView的基本概念和基础使用。需要注意的是，RecyclerView的使用并不止于此，它还提供了许多其他的配置选项和扩展，例如可以实现复杂的布局、添加动画效果、处理滚动事件等等。这些高级特性的使用需要更深入的学习和理解。"
        var view = inflater.inflate(R.layout.fragment_community , container , false)
        val textView1 : TextView = view.findViewById(R.id.community_text)
        val markwon = Markwon.builder(view.context).build()
        markwon.setMarkdown(textView1 , content)
        return view
    }
}