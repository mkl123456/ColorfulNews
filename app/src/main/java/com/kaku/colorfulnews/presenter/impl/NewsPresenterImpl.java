/*
 * © 2016 咖枯. All Rights Reserved.
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
package com.kaku.colorfulnews.presenter.impl;

import com.kaku.colorfulnews.interactor.NewsInteractor;
import com.kaku.colorfulnews.interactor.impl.NewsInteractorImpl;
import com.kaku.colorfulnews.presenter.NewsPresenter;
import com.kaku.colorfulnews.view.NewsView;

import java.util.List;

/**
 * @author 咖枯
 * @version 1.0 2016/5/19
 */
public class NewsPresenterImpl implements NewsPresenter, NewsInteractor.OnFinishedListener {

    private NewsView mNewsView;
    private NewsInteractor mNewsInteractor;

    public NewsPresenterImpl(NewsView newsView) {
        mNewsView = newsView;
        mNewsInteractor = new NewsInteractorImpl();
    }

    @Override
    public void onCreateView() {
        if (mNewsView != null) {
            mNewsView.showProgress();
        }
        mNewsInteractor.loadNews(this);
    }

    @Override
    public void onFabClicked() {

    }

    @Override
    public void onItemClicked(int position) {

    }

    @Override
    public void onDestroy() {
        mNewsView = null;

    }

    @Override
    public void onFinished(List<String> items) {
        if (mNewsView != null) {
            mNewsView.setItems(items);
            mNewsView.hideProgress();
        }

    }
}