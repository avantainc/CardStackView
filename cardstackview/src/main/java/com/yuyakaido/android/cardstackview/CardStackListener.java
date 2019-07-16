package com.yuyakaido.android.cardstackview;

import android.view.View;

public interface CardStackListener {
    void onCardDragging(Direction direction, float ratio);

    CardStackListener DEFAULT = new CardStackListener() {
        @Override
        public void onCardDragging(Direction direction, float ratio) {}

        /**
         * Last chance check conditions to complete swipe
         *
         * @return true if allow swipe, else otherwise
         */
        @Override
        public boolean onCardPreSwiped(Direction direction) {
            return true; }
        @Override
        public void onCardSwiped(Direction direction) {}
        @Override
        public void onCardRewound() {}
        @Override
        public void onCardCanceled() {}
        @Override
        public void onCardAppeared(View view, int position) {}
        @Override
        public void onCardDisappeared(View view, int position) {
        }
    };

    void onCardSwiped(Direction direction);

    void onCardRewound();

    void onCardCanceled();

    void onCardAppeared(View view, int position);

    void onCardDisappeared(View view, int position);

    boolean onCardPreSwiped(Direction direction);
}
