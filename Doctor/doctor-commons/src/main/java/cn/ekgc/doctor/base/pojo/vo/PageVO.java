package cn.ekgc.doctor.base.pojo.vo;

import java.io.Serializable;
import java.util.List;

/**
 * <b>基础信息功能 - 系统分页视图信息</b>
 * <p>
 *    系统分页视图信息设置如下属性：
 *     1. pageNum：当前页码<br/>
 *     2. PageSize：每页显示数量<br/>
 *     3. list：分页列表<br/>
 *     4. totalSize：总条数<br/>
 *     5. totalPages：总页数<br/>
 *    本项目所有功能分页信息<b>都必须以本系统分页视图信息进行封装</b>
 * </p>
 *
 * @author 李帅旗
 * @date 2021/12/29
 * @since 1.0.0
 * @version 1.0.0
 */
public class PageVO<E extends BaseVO> implements Serializable {
	private static final long serialVersionUID = 8236659175363901302L;
	private Integer pageNum;                        //当前页码
	private Integer PageSize;                       //每页显示数量
	private List<E> list;                           //分页列表
	private Long totalSize;                         //总条数
	private Long totalPages;                        //总页数

	public PageVO() {}

	public PageVO(Integer pageNum, Integer pageSize) {
		if(pageNum != null && pageNum > 0){
			this.pageNum = pageNum;
		}else {
			this.pageNum = 1;
		}

		if(pageNum != null && pageNum > 0){
			this.PageSize = pageSize;
		}else {
			this.PageSize = 10;
		}
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return PageSize;
	}

	public void setPageSize(Integer pageSize) {
		PageSize = pageSize;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	public Long getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}

	public Long getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
}
