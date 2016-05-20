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
package com.kaku.colorfulnews.interactor.impl;

import android.os.Handler;

import com.kaku.colorfulnews.interactor.NewsInteractor;

import java.util.Arrays;
import java.util.List;

/**
 * @author 咖枯
 * @version 1.0 2016/5/19
 */
public class NewsInteractorImpl implements NewsInteractor {
    @Override
    public void loadNews(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(createArrayList());
            }
        }, 2000);

    }

    private List<String> createArrayList() {
        return Arrays.asList(
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 4",
                "Item 5",
                "Item 6",
                "Item 7",
                "Item 8",
                "Item 9",
                "Item 10",
                "Item 10",
                "Item 10",
                "Item 10",
                "Item 10",
                "Item 10",
                "Item 10",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 11",
                "Item 12",
                "Item 12",
                "Item 12",
                "Item 12",
                "Item 12",
                "Item 12",
                "Item 12",
                "Item 12",
                "Item 12",
                "Item 12"
        );
    }
}