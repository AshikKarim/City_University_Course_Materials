% Fact: Meena is a student.
% This fact states that Meena is a student.
student(meena).

% Fact: Meena is a hard worker.
% This fact states that Meena is a hard worker.
hard_worker(meena).

% Rule: Every student is sincere.
% This rule states that if someone is a student, then they are sincere.
sincere(X) :- student(X).

% Rule: All who are sincere and hard workers will succeed in their career.
% This rule states that if someone is both sincere and a hard worker,
% then they will succeed in their career.
succeed_in_career(X) :- sincere(X), hard_worker(X).

% Main rule to check and write the result
% The main rule checks if Meena will succeed in her career.
% If the condition succeed_in_career(meena) is true, it writes
% 'Meena will succeed in her career.' to the console.
% If the condition is false, it writes 'Meena will not succeed in her career.'
main :-
    ( succeed_in_career(meena) ->
        write('Meena will succeed in her career.');
        write('Meena will not succeed in her career.')
    ).

% Run the main rule
% This directive tells Prolog to run the main rule when the program starts.
:- main.
