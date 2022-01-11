package com.zjk.store.ums.service.impl;

import com.zjk.store.ums.entity.Member;
import com.zjk.store.ums.mapper.MemberMapper;
import com.zjk.store.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员 服务实现类
 * </p>
 *
 * @author zjk
 * @since 2022-01-11
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
