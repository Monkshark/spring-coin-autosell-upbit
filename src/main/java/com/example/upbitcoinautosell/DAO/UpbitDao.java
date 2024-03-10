package com.example.upbitcoinautosell.DAO;

import com.example.upbitcoinautosell.VO.TickerVo;
import jakarta.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class UpbitDao {

    @Resource(name="sqlSession") private SqlSession session;
    public void test() {
        session.selectOne("Upbit.test");
    }
    public void insert_ticker(TickerVo tickerVo) {
        session.insert("Upbit.insert_ticker", tickerVo);
    }
}