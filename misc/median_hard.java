	public class median_hard {
		public static void main(String args[]) {
			if (args.length != 5) { return; }
			int median = 0;
			int arg1 = Integer.parseInt(args[0]); 
			int arg2 = Integer.parseInt(args[1]); 
			int arg3 = Integer.parseInt(args[2]); 
			int arg4 = Integer.parseInt(args[3]); 
			int arg5 = Integer.parseInt(args[4]); 
			
			// 1 ?> 2 ?> 3 ?> 4 ?> 5
			
			if ((arg1 > arg5)) { // 1 > 5 | 11>9
				if (arg1 > arg2) { // 1 > 2 ? 5 ? 3 ? 4 | 11<23
					if (arg2 > arg5) { // 1 > 2 > (5 ? 3 ? 4) 
						if (arg3 > arg4) { // 1 > 2 > (5 ? (3 > 4))
							if (arg5 > arg3) { // 1 > 2 > 5 > 3 > 4
								median = arg5;
							}
							else { // 1 > (2 ? 3) > 5 > 4
								if (arg2 > arg3) { // 1 > 2 > 3 > 5 > 4
									median = arg3;
								}
								else { // 1 > 3 > 2 > 5 > 4 
									median = arg2;
								}
							}
						}
						else { // 1 > 2 > (5 ? (4 > 3))
							if (arg5 > arg4) { // 1 > 2 > 5 > 4 > 3 
								median = arg5;
							}
							else { // 1 > 2 > 4 > 5 > 3
								median = arg4;
							}
						}
					}
					else { // 1 > 5 > 2 ? 3 ? 4)
						if (arg3 > arg4) { // 1 > 5 > 2 ? 3 > 4
							if (arg2 > arg3) { // 1 > 5 > 2 > 3 > 4
								median = arg2;
							}
							else {
								if (arg5 > arg3) { // 1 > 5 > 3 > 2 > 4
									median = arg3;
								}
								else { // 1 > 3 > 5 > 2 > 4 
									median = arg5;
								}
							}
						}
						else { // 1 > 5 > 2 ? 4 > 3
							if (arg2 > arg4) { // 1 > 5 > 2 > 4 > 3
								median = arg3;
							}
							else {
								if (arg5 > arg4) { // 1 > 5 > 4 > 2 > 3
									median = arg4;
								}
								else { // 1 > 4 > 5 > 2 > 3 
									median = arg5;
								}
							}
						}
					}
				}
				else { // 2 > 1 ? 5 ? 3 ? 4 | 11<23
					if (arg1 > arg5) { // 2 > 1 > (5 ? 3 ? 4) || 11>9
						if (arg3 > arg4) { // 2 > 1 > (5 ? (3 > 4)) | 542>122
							if (arg5 > arg3) { // 2 > 1 > 5 > 3 > 4 | 9<542
								median = arg5;
							}
							else { // 2 > (1 ? 3) > 5 > 4 
								if (arg1 > arg3) { // 2 > 1 > 3 > 5 > 4 | 11<542
									median = arg3;
								}
								else { // 2 > 3 > 1 > 5 > 4 | 23 - 542 - 11 - 9 - 122
									median = arg1;
								}
							}
						}
						else { // 2 > 1 > (5 ? (4 > 3))
							if (arg5 > arg4) { // 2 > 1 > 5 > 4 > 3 
								median = arg5;
							}
							else { // 2 > 1 > 4 > 5 > 3
								median = arg4;
							}
						}
					}
					else { // 2 > 5 > 1 ? 3 ? 4)
						if (arg3 > arg4) { // 2 > 5 > 1 ? 3 > 4
							if (arg1 > arg3) { // 2 > 5 > 1 > 3 > 4
								median = arg1;
							}
							else {
								if (arg5 > arg3) { // 2 > 5 > 3 > 1 > 4
									median = arg3;
								}
								else { // 2 > 3 > 5 > 1 > 4 
									median = arg5;
								}
							}
						}
						else { // 2 > 5 > 1 ? 4 > 3
							if (arg1 > arg4) { // 2 > 5 > 1 > 4 > 3
								median = arg3;
							}
							else {
								if (arg5 > arg4) { // 2 > 5 > 4 > 1 > 3
									median = arg4;
								}
								else { // 2 > 4 > 5 > 1 > 3 
									median = arg5;
								}
							}
						}
					}
				}
			}
			else { // 5 > 1
				if (arg5 > arg2) { // 5 > 2 ? 1 ? 3 ? 4
					if (arg2 > arg1) { // 5 > 2 > (1 ? 3 ? 4) 
						if (arg3 > arg4) { // 5 > 2 > (1 ? (3 > 4))
							if (arg1 > arg3) { // 5 > 2 > 1 > 3 > 4
								median = arg1;
							}
							else { // 5 > (2 ? 3) > 1 > 4
								if (arg2 > arg3) { // 5 > 2 > 3 > 1 > 4
									median = arg3;
								}
								else { // 5 > 3 > 2 > 1 > 4 
									median = arg2;
								}
							}
						}
						else { // 5 > 2 > (1 ? (4 > 3))
							if (arg1 > arg4) { // 5 > 2 > 1 > 4 > 3 
								median = arg1;
							}
							else { // 5 > 2 > 4 > 1 > 3
								median = arg4;
							}
						}
					}
					else { // 5 > 1 > 2 ? 3 ? 4)
						if (arg3 > arg4) { // 5 > 1 > 2 ? 3 > 4
							if (arg2 > arg3) { // 5 > 1 > 2 > 3 > 4
								median = arg2;
							}
							else {
								if (arg5 > arg3) { // 5 > 1 > 3 > 2 > 4
									median = arg3;
								}
								else { // 5 > 3 > 1 > 2 > 4 
									median = arg1;
								}
							}
						}
						else { // 5 > 1 > 2 ? 4 > 3
							if (arg2 > arg4) { // 5 > 1 > 2 > 4 > 3
								median = arg2;
							}
							else {
								if (arg1 > arg4) { // 5 > 1 > 4 > 2 > 3
									median = arg4;
								}
								else { // 5 > 4 > 1 > 2 > 3 
									median = arg1;
								}
							}
						}
					}
				}
				else {
					if (arg5 > arg1) { // 2 > 5 > (1 ? 3 ? 4) 
						if (arg3 > arg4) { // 2 > 5 > (1 ? (3 > 4))
							if (arg1 > arg3) { // 2 > 5 > 1 > 3 > 4
								median = arg1;
							}
							else { // 2 > (1 ? 3) > 1 > 4
								if (arg1 > arg3) { // 2 > 5 > 3 > 1 > 4
									median = arg3;
								}
								else { // 2 > 3 > 5 > 1 > 4 
									median = arg1;
								}
							}
						}
						else { // 2 > 1 > (5 ? (4 > 3))
							if (arg5 > arg4) { // 2 > 1 > 5 > 4 > 3 
								median = arg5;
							}
							else { // 2 > 1 > 4 > 5 > 3
								median = arg4;
							}
						}
					}
					else { // 2 > 1 > 5 ? 3 ? 4)
						if (arg3 > arg4) { // 2 > 1 > 5 ? 3 > 4
							if (arg5 > arg3) { // 2 > 1 > 5 > 3 > 4
								median = arg5;
							}
							else {
								if (arg1 > arg3) { // 2 > 1 > 3 > 5 > 4
									median = arg3;
								}
								else { // 2 > 3 > 1 > 5 > 4 
									median = arg1;
								}
							}
						}
						else { // 2 > 1 > 5 ? 4 > 3
							if (arg5 > arg4) { // 2 > 1 > 5 > 4 > 3
								median = arg5;
							}
							else {
								if (arg1 > arg4) { // 2 > 1 > 4 > 5 > 3
									median = arg4;
								}
								else { // 2 > 4 > 1 > 5 > 3 
									median = arg1;
								}
							}
						}
					}
				}
			}
			System.out.print(median);
		}
	}