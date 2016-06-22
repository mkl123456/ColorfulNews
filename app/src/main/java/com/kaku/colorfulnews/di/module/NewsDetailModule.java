/*
 * Copyright (c) 2016 咖枯 <kaku201313@163.com | 3772304@qq.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.kaku.colorfulnews.di.module;

import com.kaku.colorfulnews.di.module.base.BaseModule;
import com.kaku.colorfulnews.mvp.presenter.NewsDetailPresenter;
import com.kaku.colorfulnews.mvp.presenter.impl.NewsDetailPresenterImpl;
import com.kaku.colorfulnews.mvp.view.NewsDetailView;

import dagger.Module;
import dagger.Provides;

/**
 * @author 咖枯
 * @version 1.0 2016/6/7
 */
@Module
public class NewsDetailModule extends BaseModule<NewsDetailView> {
    private String mPostId;

    public NewsDetailModule(NewsDetailView newsDetailView, String postId) {
        mView = newsDetailView;
        mPostId = postId;
    }

    @Provides
    public NewsDetailPresenter provideNewsDetailPresenter() {
        return new NewsDetailPresenterImpl(mView, mPostId);
    }
}