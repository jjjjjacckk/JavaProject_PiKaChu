# JavaProject_PiKaChu

## 球的物理

- 一般：``x`` ``y``個有基本速度（值不變），依照碰撞情況改變 ``x`` 方向，做``類拋物線運動``（`y`速度每一次更新加1, 方向會逐漸往下）。
    - 碰撞情況：皮卡丘和球都是一個正方形，當球碰到皮卡丘的...
        1. 上方：「僅向上」的拋物線運動 (僅有y速度) 
        2. 左邊：「向左上」的拋物線運動 (``x``速度小於0、``y``速度拋物線) 
        3. 右邊：「向右上」的拋物線運動 (``x``速度大於0、``y``速度拋物線)
    
- 扣球：
    1. 檢查球與皮卡丘的碰撞範圍
    2. 如果有交集，再檢查「皮卡丘是否跳起」以及「是否按下扣球按鍵」
    3. 如果為真：``x`` ``y``速度值會變一樣且比一般速度大，做直線運動。 
