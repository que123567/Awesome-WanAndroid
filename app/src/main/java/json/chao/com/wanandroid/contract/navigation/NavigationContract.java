package json.chao.com.wanandroid.contract.navigation;

import java.util.List;

import json.chao.com.wanandroid.core.bean.BaseResponse;
import json.chao.com.wanandroid.core.bean.navigation.NavigationListData;
import json.chao.com.wanandroid.base.presenter.AbstractPresenter;
import json.chao.com.wanandroid.base.view.BaseView;

/**
 * @author quchao
 * @date 2018/2/11
 */

public interface NavigationContract {

    interface View extends BaseView {

        /**
         * Show navigation list data
         *
         * @param navigationDataList List<NavigationListData>
         */
        void showNavigationListData(List<NavigationListData> navigationDataList);

    }

    interface Presenter extends AbstractPresenter<View> {

        /**
         * Get navigation list data
         */
        void getNavigationListData();
    }

}
