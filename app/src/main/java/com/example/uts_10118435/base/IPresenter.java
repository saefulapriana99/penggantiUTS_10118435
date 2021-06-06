package com.example.uts_10118435.base;

//04 June 2021, 10118737, Moch Rifqi Ramdhani, IF10
public interface IPresenter<T extends IView, IView> {
    void onAttach(T view);
    void onDetach();
}
