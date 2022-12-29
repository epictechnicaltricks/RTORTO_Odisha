
/*

                    Dialog dialog= new Dialog(CreateEvent.this);
                    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

                    dialog.setContentView(R.layout.create_event_dialog);

                    dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                    dialog.getWindow().setLayout(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);


                    MaterialButton create_one = dialog.findViewById(R.id.create_now);
                    MaterialTextView no_continue = dialog.findViewById(R.id.no_continue);


                    create_one.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {


                            try {

                                Intent intent = new Intent(getApplicationContext(), Class.forName("com.infyson.invitationcard.activity.SelectCardActivity"));
                                startActivity(intent);

                            } catch (Exception e) {

                                Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_SHORT).show();
                                e.printStackTrace();

                            }


                        }
                    });

                    no_continue.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            eventUpload(method.userId(), categoryId, title, description, email, phoneNo,
                                    website, ticket, personTicket, price,
                                    address, latitude, longitude, dateStarting, startTime,
                                    dateEnding, endTime, pathLogo, pathBanner,
                                    registerDateStarting, registerStartTime, registerDateEnding, registerEndTime);

                        }
                    });

                    dialog.show();

*/




                 /*   MaterialAlertDialogBuilder al = new MaterialAlertDialogBuilder(this, R.style.DialogTitleTextStyle);
                    al.setTitle("Want to create an invitation?");
                    al.setMessage("Create, edit and share your own invitation, Choose create now button to create.");
                    al.setCancelable(false);

                    al.setPositiveButton("CREATE NOW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {


                        }
                    });

                    al.setNegativeButton("NO, CONTINUE", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });


                    al.create().show();*/

