def solve_puzzle():
    for T in range(1, 10):  # T cannot be 0 (as it's a leading digit)
        for W in range(10):
            if W == T:
                continue
            for O in range(10):
                if O == T or O == W:
                    continue
                
                two_two_T_W_O = 2 * (100 * T + 10 * W + O)
                
                if two_two_T_W_O >= 1000 and two_two_T_W_O <= 9999:
                    F = two_two_T_W_O // 1000
                    rest = two_two_T_W_O % 1000
                    O_ = rest // 100
                    U = (rest % 100) // 10
                    R = rest % 10
                    
                    if (F != O and F != U and F != R and
                        O_ != F and O_ != U and O_ != R and
                        U != F and U != O and U != R and
                        R != F and R != O and R != U):
                        
                        if (T != F and T != O_ and T != U and T != R and
                            W != F and W != O_ and W != U and W != R):
                            
                            if O == O_:  # Check if O equals O_
                                print(f"T = {T}, W = {W}, O = {O}, F = {F}, U = {U}, R = {R}")

# Call the function to solve the puzzle
solve_puzzle()
