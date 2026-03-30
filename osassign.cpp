#include <iostream>
using namespace std;

struct scheduling {
    int id;
    int arrivaltime;
    int bursttime;
    int completiontime;
    int waitingtime;
    int turnaroundtime;
};

void swap(scheduling &a, scheduling &b) {
    scheduling temp = a;
    a = b;
    b = temp;
}

void selection(scheduling process[], int n) {
    for (int i = 0; i < n - 1; ++i) {
        int minindex = i;
        for (int j = i + 1; j < n; ++j) {
            if (process[j].arrivaltime < process[minindex].arrivaltime) {
                minindex = j;
            }
        }
        if (minindex != i) {
            swap(process[i], process[minindex]);
        }
    }
}
void calculatetime(scheduling process[], int n) {
    int currenttime = 0;
    int totalwaitingtime = 0;
    int totalturnaroundtime = 0;

    for (int i = 0; i < n; ++i) {
        if (currenttime < process[i].arrivaltime) {
            currenttime = process[i].arrivaltime;
        }
        process[i].completiontime = currenttime + process[i].bursttime;
        process[i].turnaroundtime = process[i].completiontime - process[i].arrivaltime;
        process[i].waitingtime = process[i].turnaroundtime - process[i].bursttime;

        currenttime = process[i].completiontime;

        totalwaitingtime += process[i].waitingtime;
        totalturnaroundtime += process[i].turnaroundtime;
    }

    float avgwaitingtime = (float)totalwaitingtime / n;
    float avgturnaroundtime = (float)totalturnaroundtime / n;

    cout << "\nAverage Waiting Time: " << avgwaitingtime << endl;
    cout << "Average Turnaround Time: " << avgturnaroundtime << endl;
}

void display(scheduling process[], int n) {
    cout << "\nProcess\tArrival Time\tBurst Time\tCompletion Time\tWaiting Time\tTurnaround Time\n";
    for (int i = 0; i < n; ++i) {
        cout << "P" << process[i].id << "\t" << process[i].arrivaltime << "\t\t" 
             << process[i].bursttime << "\t\t" 
             << process[i].completiontime << "\t\t" 
             << process[i].waitingtime << "\t\t" 
             << process[i].turnaroundtime << endl;
    }
}

int main() {
    int n;
    cout << "Enter number of processes: ";
    cin >> n;
    scheduling process[n];

    cout << "Enter arrival time and burst time for each process:\n";
    for (int i = 0; i < n; i++) {
        process[i].id = i + 1;
        cout << "Process " << i + 1 << ":\n";
        cout << "Arrival time: ";
        cin >> process[i].arrivaltime;
        cout << "Burst time: ";
        cin >> process[i].bursttime;
    }

    selection(process, n);
    calculatetime(process, n);
    display(process, n);

    return 0;
}