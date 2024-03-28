package cn.org.alan.exam.service;

import cn.org.alan.exam.model.entity.Grade;
import cn.org.alan.exam.model.form.GradeForm;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author WeiJin
 * @since 2024-03-21
 */
public interface IGradeService extends IService<Grade> {



    void addGrade(GradeForm gradeForm);

    void updateGrade(Integer id, GradeForm gradeForm);

    void deleteGrade(Integer id);

    void getPaging(Integer pageNum, Integer pageSize, String gradeName);
}
