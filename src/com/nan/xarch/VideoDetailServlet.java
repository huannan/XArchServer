package com.nan.xarch;

import com.nan.xarch.base.BaseJsonServlet;
import com.nan.xarch.base.ResponseEntity;
import com.nan.xarch.bean.VideoBean;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/videodetail")
public class VideoDetailServlet extends BaseJsonServlet<VideoBean> {

    @Override
    protected ResponseEntity<VideoBean> onHandle(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String brand = req.getHeader("brand");
        String model = req.getHeader("model");
        String id = req.getParameter("id");
        VideoBean bean = new VideoBean(id, String.format("视频标题 请求头: brand=%s model=%s", brand, model));
        return ResponseEntity.ofSuccess(bean);
    }
}
