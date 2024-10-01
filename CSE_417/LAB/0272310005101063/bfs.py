from collections import deque

# Define the goal state
GOAL_STATE = ((0, 7, 2),
              (1, 4, 5),
              (5, 8, 3))

# Function to check if a state is the goal state
def is_goal(state):
    return state == GOAL_STATE

# Function to find the position of the blank (0) tile
def find_blank(state):
    for i in range(3):
        for j in range(3):
            if state[i][j] == 0:
                return i, j

# Function to generate successors of the current state
def successors(state):
    x, y = find_blank(state)
    directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
    result = []
    for dx, dy in directions:
        nx, ny = x + dx, y + dy
        if 0 <= nx < 3 and 0 <= ny < 3:
            new_state = [list(row) for row in state]
            new_state[x][y], new_state[nx][ny] = new_state[nx][ny], new_state[x][y]
            result.append(tuple(tuple(row) for row in new_state))
    return result

# BFS algorithm
def bfs(initial_state):
    queue = deque([(initial_state, [])])
    visited = set()
    while queue:
        state, path = queue.popleft()
        if state in visited:
            continue
        visited.add(state)
        if is_goal(state):
            return path + [state]
        for successor in successors(state):
            queue.append((successor, path + [state]))
    return None

# Initial state
initial_state = ((5, 3, 2),
                 (7, 1, 6),
                 (8, 4, 0))

# Solve the puzzle
solution = bfs(initial_state)

# Print the solution
if solution:
    print("Solution found in {} steps:".format(len(solution) - 1))
    for step in solution:
        for row in step:
            print(row)
        print()
else:
    print("No solution found.")
