# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "All non-test packages for the target from files/${ROS_DISTRO}/cache.yaml"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = "${PN}"

# Does not include packages in ROS_SUPERFLORE_GENERATED_BUILDTOOLS (with -native removed) or ROS_SUPERFLORE_GENERATED_TESTS. (Both
# are set in conf/ros-distro/include/ROS_DISTRO/generated-ros-distro.inc).
RDEPENDS_${PN} = " \
    abseil-cpp \
    acado \
    access-point-control \
    ackermann-msgs \
    ackermann-steering-controller \
    actionlib \
    actionlib-lisp \
    actionlib-msgs \
    actionlib-tutorials \
    adi-driver \
    agni-tf-tools \
    allocators \
    amcl \
    angles \
    app-manager \
    ar-track-alvar \
    ar-track-alvar-msgs \
    arbotix \
    arbotix-controllers \
    arbotix-firmware \
    arbotix-msgs \
    arbotix-python \
    arbotix-sensors \
    ariles-ros \
    asmach \
    asmach-tutorials \
    assimp-devel \
    assisted-teleop \
    astuff-sensor-msgs \
    async-comm \
    async-web-server-cpp \
    audibot \
    audibot-description \
    audibot-gazebo \
    audio-capture \
    audio-common \
    audio-common-msgs \
    audio-play \
    automotive-autonomy-msgs \
    automotive-navigation-msgs \
    automotive-platform-msgs \
    aws-common \
    aws-ros1-common \
    backward-ros \
    bagger \
    base-local-planner \
    bayesian-belief-networks \
    behaviortree-cpp \
    behaviortree-cpp-v3 \
    bfl \
    bond \
    bond-core \
    bondcpp \
    bondpy \
    brics-actuator \
    calibration \
    calibration-estimation \
    calibration-launch \
    calibration-msgs \
    calibration-setup-helper \
    camera-calibration \
    camera-calibration-parsers \
    camera-info-manager \
    camera-umd \
    can-msgs \
    canopen-402 \
    canopen-chain-node \
    canopen-master \
    canopen-motor-node \
    capabilities \
    carrot-planner \
    cartesian-msgs \
    cartographer \
    cartographer-ros \
    cartographer-ros-msgs \
    cartographer-rviz \
    catch-ros \
    catkin \
    catkin-virtualenv \
    checkerboard-detector \
    chomp-motion-planner \
    cl-tf \
    cl-tf2 \
    cl-transforms \
    cl-transforms-stamped \
    cl-urdf \
    cl-utils \
    class-loader \
    clear-costmap-recovery \
    cloudwatch-logger \
    cloudwatch-logs-common \
    cloudwatch-metrics-collector \
    cloudwatch-metrics-common \
    cmake-modules \
    cob-actions \
    cob-common \
    cob-default-env-config \
    cob-description \
    cob-environments \
    cob-msgs \
    cob-srvs \
    code-coverage \
    codec-image-transport \
    collada-parser \
    collada-urdf \
    collada-urdf-jsk-patch \
    combined-robot-hw \
    combined-robot-hw-tests \
    common-msgs \
    common-tutorials \
    compressed-depth-image-transport \
    compressed-image-transport \
    concert-msgs \
    concert-service-msgs \
    concert-workflow-engine-msgs \
    control-msgs \
    control-toolbox \
    controller-interface \
    controller-manager \
    controller-manager-msgs \
    controller-manager-tests \
    convex-decomposition \
    costmap-2d \
    costmap-converter \
    costmap-cspace-msgs \
    costmap-queue \
    cpp-common \
    cv-bridge \
    dataspeed-can \
    dataspeed-can-msg-filters \
    dataspeed-can-tools \
    dataspeed-can-usb \
    dataspeed-pds \
    dataspeed-pds-can \
    dataspeed-pds-msgs \
    dataspeed-pds-rqt \
    dataspeed-pds-scripts \
    dataspeed-ulc \
    dataspeed-ulc-can \
    dataspeed-ulc-msgs \
    dbw-fca \
    dbw-fca-can \
    dbw-fca-description \
    dbw-fca-joystick-demo \
    dbw-fca-msgs \
    dbw-mkz \
    dbw-mkz-can \
    dbw-mkz-description \
    dbw-mkz-joystick-demo \
    dbw-mkz-msgs \
    dbw-mkz-twist-controller \
    ddwrt-access-point \
    ddynamic-reconfigure-python \
    default-cfg-fkie \
    delphi-esr-msgs \
    delphi-mrr-msgs \
    delphi-srr-msgs \
    depth-image-proc \
    depthcloud-encoder \
    depthimage-to-laserscan \
    derived-object-msgs \
    desistek-saga-control \
    desistek-saga-description \
    desistek-saga-gazebo \
    desktop \
    desktop-full \
    diagnostic-aggregator \
    diagnostic-analysis \
    diagnostic-common-diagnostics \
    diagnostic-msgs \
    diagnostic-updater \
    diagnostics \
    diff-drive-controller \
    dlux-global-planner \
    dlux-plugins \
    downward \
    driver-base \
    driver-common \
    dwa-local-planner \
    dwb-critics \
    dwb-local-planner \
    dwb-msgs \
    dwb-plugins \
    dynamic-edt-3d \
    dynamic-reconfigure \
    dynamic-robot-state-publisher \
    dynamic-tf-publisher \
    dynamixel-sdk \
    dynamixel-workbench \
    dynamixel-workbench-controllers \
    dynamixel-workbench-msgs \
    dynamixel-workbench-operators \
    dynamixel-workbench-single-manager \
    dynamixel-workbench-single-manager-gui \
    dynamixel-workbench-toolbox \
    easy-markers \
    eca-a9-control \
    eca-a9-description \
    eca-a9-gazebo \
    ecl \
    ecl-build \
    ecl-command-line \
    ecl-concepts \
    ecl-config \
    ecl-console \
    ecl-containers \
    ecl-converters \
    ecl-converters-lite \
    ecl-core \
    ecl-core-apps \
    ecl-devices \
    ecl-eigen \
    ecl-errors \
    ecl-exceptions \
    ecl-filesystem \
    ecl-formatters \
    ecl-geometry \
    ecl-io \
    ecl-ipc \
    ecl-license \
    ecl-linear-algebra \
    ecl-lite \
    ecl-manipulation \
    ecl-manipulators \
    ecl-math \
    ecl-mobile-robot \
    ecl-mpl \
    ecl-navigation \
    ecl-sigslots \
    ecl-sigslots-lite \
    ecl-statistics \
    ecl-streams \
    ecl-threads \
    ecl-time \
    ecl-time-lite \
    ecl-tools \
    ecl-type-traits \
    ecl-utilities \
    effort-controllers \
    eigen-conversions \
    eigen-stl-containers \
    eigenpy \
    epos2-motor-controller \
    ethercat-grant \
    ethercat-hardware \
    ethercat-trigger-controllers \
    eus-assimp \
    euscollada \
    euslisp \
    eusurdf \
    executive-smach \
    executive-smach-visualization \
    exotica \
    exotica-aico-solver \
    exotica-collision-scene-fcl \
    exotica-collision-scene-fcl-latest \
    exotica-core \
    exotica-core-task-maps \
    exotica-examples \
    exotica-ik-solver \
    exotica-levenberg-marquardt-solver \
    exotica-ompl-solver \
    exotica-python \
    exotica-time-indexed-rrt-connect-solver \
    face-detector \
    fake-localization \
    fcl-catkin \
    fetch-auto-dock-msgs \
    fetch-bringup \
    fetch-calibration \
    fetch-depth-layer \
    fetch-description \
    fetch-driver-msgs \
    fetch-drivers \
    fetch-gazebo \
    fetch-gazebo-demo \
    fetch-ikfast-plugin \
    fetch-maps \
    fetch-moveit-config \
    fetch-navigation \
    fetch-open-auto-dock \
    fetch-ros \
    fetch-simulation \
    fetch-teleop \
    fetch-tools \
    fetchit-challenge \
    ff \
    ffha \
    filters \
    find-object-2d \
    fingertip-pressure \
    fkie-message-filters \
    fkie-potree-rviz-plugin \
    flexbe-behavior-engine \
    flexbe-core \
    flexbe-input \
    flexbe-mirror \
    flexbe-msgs \
    flexbe-onboard \
    flexbe-states \
    flexbe-testing \
    flexbe-widget \
    flir-boson-usb \
    fmi-adapter \
    fmi-adapter-examples \
    force-torque-sensor-controller \
    forward-command-controller \
    four-wheel-steering-controller \
    four-wheel-steering-msgs \
    franka-description \
    freight-bringup \
    gateway-msgs \
    gazebo-msgs \
    gazebo-plugins \
    gazebo-ros \
    gazebo-ros-control \
    gazebo-ros-pkgs \
    gazebo-rosdev \
    gencpp \
    geneus \
    genlisp \
    genmsg \
    gennodejs \
    genpy \
    geodesy \
    geographic-info \
    geographic-msgs \
    geometric-shapes \
    geometry \
    geometry-msgs \
    geometry-tutorials \
    geometry2 \
    gl-dependency \
    global-planner \
    global-planner-tests \
    goal-passer \
    gps-common \
    gps-umd \
    gpsd-client \
    graft \
    graph-msgs \
    grasping-msgs \
    grid-map \
    grid-map-core \
    grid-map-costmap-2d \
    grid-map-cv \
    grid-map-demos \
    grid-map-filters \
    grid-map-loader \
    grid-map-msgs \
    grid-map-octomap \
    grid-map-pcl \
    grid-map-ros \
    grid-map-rviz-plugin \
    grid-map-sdf \
    grid-map-visualization \
    gripper-action-controller \
    grpc \
    gscam \
    h264-encoder-core \
    h264-video-encoder \
    hardware-interface \
    health-metric-collector \
    hector-components-description \
    hector-gazebo \
    hector-gazebo-plugins \
    hector-gazebo-thermal-camera \
    hector-gazebo-worlds \
    hector-models \
    hector-sensors-description \
    hector-sensors-gazebo \
    hector-xacro-tools \
    hls-lfcd-lds-driver \
    hostapd-access-point \
    hpp-fcl \
    ibeo-core \
    ibeo-lux \
    ibeo-msgs \
    ieee80211-channels \
    ifopt \
    igvc-self-drive-description \
    igvc-self-drive-gazebo \
    igvc-self-drive-gazebo-plugins \
    igvc-self-drive-sim \
    iirob-filters \
    image-cb-detector \
    image-common \
    image-geometry \
    image-pipeline \
    image-proc \
    image-publisher \
    image-rotate \
    image-transport \
    image-transport-plugins \
    image-view \
    image-view2 \
    imagesift \
    imagezero \
    imagezero-image-transport \
    imagezero-ros \
    imu-complementary-filter \
    imu-filter-madgwick \
    imu-pipeline \
    imu-processors \
    imu-sensor-controller \
    imu-tools \
    imu-transformer \
    industrial-core \
    industrial-deprecated \
    industrial-msgs \
    industrial-robot-client \
    industrial-robot-simulator \
    industrial-trajectory-filters \
    industrial-utils \
    interactive-marker-proxy \
    interactive-marker-tutorials \
    interactive-markers \
    interval-intersection \
    ipr-extern \
    ivcon \
    joint-limits-interface \
    joint-state-controller \
    joint-state-publisher \
    joint-states-settler \
    joint-trajectory-action \
    joint-trajectory-action-tools \
    joint-trajectory-controller \
    joint-trajectory-generator \
    joy \
    joy-listener \
    joy-teleop \
    joystick-drivers \
    jpeg-streamer \
    jsk-3rdparty \
    jsk-common \
    jsk-common-msgs \
    jsk-data \
    jsk-footstep-msgs \
    jsk-gui-msgs \
    jsk-hark-msgs \
    jsk-interactive \
    jsk-interactive-marker \
    jsk-interactive-test \
    jsk-model-tools \
    jsk-network-tools \
    jsk-pcl-ros \
    jsk-pcl-ros-utils \
    jsk-perception \
    jsk-recognition \
    jsk-recognition-msgs \
    jsk-recognition-utils \
    jsk-roseus \
    jsk-rqt-plugins \
    jsk-rviz-plugins \
    jsk-tilt-laser \
    jsk-tools \
    jsk-topic-tools \
    jsk-visualization \
    jskeus \
    json-msgs \
    json-transport \
    julius \
    julius-ros \
    kalman-filter \
    kartech-linear-actuator-msgs \
    kdl-conversions \
    kdl-parser \
    kdl-parser-py \
    key-teleop \
    kinesis-manager \
    kinesis-video-msgs \
    kinesis-video-streamer \
    kobuki-core \
    kobuki-dock-drive \
    kobuki-driver \
    kobuki-ftdi \
    kobuki-msgs \
    laser-assembler \
    laser-cb-detector \
    laser-filtering \
    laser-filters \
    laser-filters-jsk-patch \
    laser-geometry \
    laser-pipeline \
    laser-proc \
    lauv-control \
    lauv-description \
    lauv-gazebo \
    leg-detector \
    lex-common-msgs \
    lex-node \
    lgsvl-msgs \
    libcmt \
    libg2o \
    libmavconn \
    libmodbus \
    libphidget21 \
    libqt-concurrent \
    libqt-core \
    libqt-gui \
    libqt-network \
    libqt-opengl \
    libqt-opengl-rosdev \
    libqt-rosdev \
    libqt-svg-rosdev \
    libqt-widgets \
    libreflexxestype2 \
    librviz-tutorial \
    libsiftfast \
    libuvc \
    libuvc-camera \
    libuvc-ros \
    linksys-access-point \
    lockfree \
    locomotor \
    locomotor-msgs \
    locomove-base \
    lpg-planner \
    lusb \
    map-laser \
    map-merge-3d \
    map-msgs \
    map-organizer-msgs \
    map-server \
    mapviz \
    mapviz-plugins \
    marker-msgs \
    marti-can-msgs \
    marti-common-msgs \
    marti-data-structures \
    marti-nav-msgs \
    marti-perception-msgs \
    marti-sensor-msgs \
    marti-status-msgs \
    marti-visualization-msgs \
    master-discovery-fkie \
    master-sync-fkie \
    mavlink \
    mavros \
    mavros-extras \
    mavros-msgs \
    mbf-abstract-core \
    mbf-costmap-core \
    mbf-utility \
    mcl-3dl \
    mcl-3dl-msgs \
    md49-base-controller \
    md49-messages \
    md49-serialport \
    media-export \
    message-filters \
    message-generation \
    message-runtime \
    microstrain-3dmgx2-imu \
    mini-maxwell \
    mir-actions \
    mir-description \
    mir-driver \
    mir-dwb-critics \
    mir-gazebo \
    mir-msgs \
    mir-navigation \
    mir-robot \
    mk \
    ml-classifiers \
    mobileye-560-660-msgs \
    mongodb-log \
    mongodb-store \
    mongodb-store-msgs \
    monocam-settler \
    mouse-teleop \
    move-base \
    move-base-flex \
    move-base-msgs \
    move-slow-and-clear \
    moveit \
    moveit-chomp-optimizer-adapter \
    moveit-commander \
    moveit-controller-manager-example \
    moveit-core \
    moveit-experimental \
    moveit-fake-controller-manager \
    moveit-kinematics \
    moveit-msgs \
    moveit-planners \
    moveit-planners-chomp \
    moveit-planners-ompl \
    moveit-plugins \
    moveit-python \
    moveit-resources \
    moveit-ros \
    moveit-ros-benchmarks \
    moveit-ros-control-interface \
    moveit-ros-manipulation \
    moveit-ros-move-group \
    moveit-ros-perception \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    moveit-ros-robot-interaction \
    moveit-ros-visualization \
    moveit-ros-warehouse \
    moveit-runtime \
    moveit-setup-assistant \
    moveit-sim-controller \
    moveit-simple-controller-manager \
    moveit-visual-tools \
    movie-publisher \
    mrpt-bridge \
    mrpt-ekf-slam-2d \
    mrpt-ekf-slam-3d \
    mrpt-graphslam-2d \
    mrpt-icp-slam-2d \
    mrpt-local-obstacles \
    mrpt-localization \
    mrpt-map \
    mrpt-msgs \
    mrpt-navigation \
    mrpt-rawlog \
    mrpt-rbpf-slam \
    mrpt-reactivenav2d \
    mrpt-slam \
    mrpt-tutorials \
    mrpt1 \
    multi-interface-roam \
    multi-map-server \
    multi-object-tracking-lidar \
    multimaster-fkie \
    multimaster-msgs-fkie \
    multires-image \
    multisense \
    multisense-bringup \
    multisense-cal-check \
    multisense-description \
    multisense-lib \
    multisense-ros \
    mvsim \
    nanomsg \
    nav-2d-msgs \
    nav-2d-utils \
    nav-core \
    nav-core-adapter \
    nav-core2 \
    nav-grid \
    nav-grid-iterators \
    nav-grid-pub-sub \
    nav-msgs \
    nav2d \
    nav2d-exploration \
    nav2d-karto \
    nav2d-localizer \
    nav2d-msgs \
    nav2d-navigator \
    nav2d-operator \
    nav2d-remote \
    nav2d-tutorials \
    navfn \
    navigation \
    navigation-experimental \
    navigation-layers \
    neobotix-usboard-msgs \
    neonavigation-msgs \
    neonavigation-rviz-plugins \
    nerian-stereo \
    network-control-tests \
    network-detector \
    network-interface \
    network-monitor-udp \
    network-traffic-control \
    nlopt \
    nmea-msgs \
    nmea-navsat-driver \
    node-manager-fkie \
    nodelet \
    nodelet-core \
    nodelet-topic-tools \
    nodelet-tutorial-math \
    novatel-gps-driver \
    novatel-gps-msgs \
    novatel-msgs \
    novatel-span-driver \
    object-recognition-msgs \
    ocean-battery-driver \
    octomap \
    octomap-mapping \
    octomap-msgs \
    octomap-ros \
    octomap-server \
    octovis \
    odva-ethernetip \
    ompl \
    omron-os32c-driver \
    open-karto \
    open-manipulator \
    open-manipulator-control-gui \
    open-manipulator-controller \
    open-manipulator-description \
    open-manipulator-gazebo \
    open-manipulator-libs \
    open-manipulator-moveit \
    open-manipulator-msgs \
    open-manipulator-simulations \
    open-manipulator-teleop \
    open-manipulator-with-tb3 \
    open-manipulator-with-tb3-description \
    open-manipulator-with-tb3-gazebo \
    open-manipulator-with-tb3-simulations \
    open-manipulator-with-tb3-tools \
    open-manipulator-with-tb3-waffle-moveit \
    open-manipulator-with-tb3-waffle-pi-moveit \
    opencv-apps \
    openni-camera \
    openni-description \
    openni-launch \
    openni2-camera \
    openni2-launch \
    opt-camera \
    optpp-catkin \
    orocos-kdl \
    orocos-kinematics-dynamics \
    ouster-driver \
    oxford-gps-eth \
    p2os-doc \
    p2os-driver \
    p2os-launch \
    p2os-msgs \
    p2os-teleop \
    p2os-urdf \
    pacmod-game-control \
    pacmod-msgs \
    pacmod3 \
    panda-moveit-config \
    parrot-arsdk \
    pcl-conversions \
    pcl-msgs \
    pcl-ros \
    people \
    people-msgs \
    people-tracking-filter \
    people-velocity-tracker \
    pepperl-fuchs-r2000 \
    perception \
    perception-pcl \
    pgm-learner \
    pheeno-ros-description \
    phidgets-api \
    phidgets-drivers \
    phidgets-high-speed-encoder \
    phidgets-ik \
    phidgets-imu \
    photo \
    pid \
    pilz-control \
    pilz-extensions \
    pilz-industrial-motion \
    pilz-industrial-motion-testutils \
    pilz-msgs \
    pilz-robot-programming \
    pilz-robots \
    pilz-testutils \
    pilz-trajectory-generation \
    pinocchio \
    planner-cspace-msgs \
    plotjuggler \
    pluginlib \
    pluginlib-tutorials \
    pointcloud-to-laserscan \
    polled-camera \
    pose-base-controller \
    pose-cov-ops \
    pose-follower \
    posedetection-msgs \
    position-controllers \
    power-monitor \
    power-msgs \
    pr2-app-manager \
    pr2-apps \
    pr2-arm-kinematics \
    pr2-arm-move-ik \
    pr2-calibration-controllers \
    pr2-common \
    pr2-common-action-msgs \
    pr2-common-actions \
    pr2-controller-configuration-gazebo \
    pr2-controller-interface \
    pr2-controller-manager \
    pr2-controllers \
    pr2-controllers-msgs \
    pr2-dashboard-aggregator \
    pr2-description \
    pr2-ethercat-drivers \
    pr2-gazebo \
    pr2-gazebo-plugins \
    pr2-gripper-action \
    pr2-hardware-interface \
    pr2-head-action \
    pr2-kinematics \
    pr2-machine \
    pr2-mannequin-mode \
    pr2-mechanism \
    pr2-mechanism-controllers \
    pr2-mechanism-diagnostics \
    pr2-mechanism-model \
    pr2-mechanism-msgs \
    pr2-msgs \
    pr2-position-scripts \
    pr2-power-board \
    pr2-power-drivers \
    pr2-simulator \
    pr2-teleop-general \
    pr2-tilt-laser-interface \
    pr2-tuck-arms-action \
    pr2-tuckarm \
    prbt-gazebo \
    prbt-grippers \
    prbt-hardware-support \
    prbt-ikfast-manipulator-plugin \
    prbt-moveit-config \
    prbt-pg70-support \
    prbt-support \
    prosilica-camera \
    ps3joy \
    py-trees \
    py-trees-msgs \
    py-trees-ros \
    pybind11-catkin \
    python-orocos-kdl \
    python-qt-binding \
    qt-dotgraph \
    qt-gui \
    qt-gui-app \
    qt-gui-core \
    qt-gui-cpp \
    qt-gui-py-common \
    qt-qmake \
    qwt-dependency \
    radar-msgs \
    rail-manipulation-msgs \
    random-numbers \
    range-sensor-layer \
    raw-description \
    rc-cloud-accumulator \
    rc-common-msgs \
    rc-dynamics-api \
    rc-genicam-api \
    rc-hand-eye-calibration-client \
    rc-visard \
    rc-visard-description \
    rc-visard-driver \
    realtime-tools \
    resized-image-transport \
    resource-retriever \
    respeaker-ros \
    rexrov2-control \
    rexrov2-description \
    rexrov2-gazebo \
    rgbd-launch \
    robot \
    robot-activity \
    robot-activity-msgs \
    robot-activity-tutorials \
    robot-calibration \
    robot-calibration-msgs \
    robot-controllers \
    robot-controllers-interface \
    robot-controllers-msgs \
    robot-localization \
    robot-mechanism-controllers \
    robot-navigation \
    robot-pose-ekf \
    robot-self-filter \
    robot-state-publisher \
    robot-upstart \
    robotis-manipulator \
    rocon-app-manager-msgs \
    rocon-bubble-icons \
    rocon-console \
    rocon-device-msgs \
    rocon-ebnf \
    rocon-icons \
    rocon-interaction-msgs \
    rocon-interactions \
    rocon-launch \
    rocon-master-info \
    rocon-msgs \
    rocon-python-comms \
    rocon-python-redis \
    rocon-python-utils \
    rocon-python-wifi \
    rocon-semantic-version \
    rocon-service-pair-msgs \
    rocon-std-msgs \
    rocon-tools \
    rocon-tutorial-msgs \
    rocon-uri \
    ros--distro-renamed \
    ros-base \
    ros-canopen \
    ros-comm \
    ros-control \
    ros-control-boilerplate \
    ros-controllers \
    ros-core \
    ros-emacs-utils \
    ros-environment \
    ros-introspection \
    ros-monitoring-msgs \
    ros-pytest \
    ros-reflexxes \
    ros-speech-recognition \
    ros-tutorials \
    ros-type-introspection \
    rosapi \
    rosatomic \
    rosauth \
    rosbag \
    rosbag-migration-rule \
    rosbag-pandas \
    rosbag-storage \
    rosbaglive \
    rosbash \
    rosbash-params \
    rosboost-cfg \
    rosbridge-library \
    rosbridge-msgs \
    rosbridge-server \
    rosbridge-suite \
    rosbuild \
    rosclean \
    roscompile \
    rosconsole \
    rosconsole-bridge \
    roscpp \
    roscpp-core \
    roscpp-serialization \
    roscpp-traits \
    roscpp-tutorials \
    roscreate \
    rosdiagnostic \
    rosdoc-lite \
    rosemacs \
    roseus \
    rosfmt \
    rosgraph \
    rosgraph-msgs \
    roslang \
    roslaunch \
    roslib \
    roslint \
    roslisp \
    roslisp-common \
    roslisp-repl \
    roslisp-utilities \
    roslz4 \
    rosmake \
    rosmaster \
    rosmon \
    rosmon-core \
    rosmon-msgs \
    rosmsg \
    rosnode \
    rosout \
    rospack \
    rosparam \
    rosparam-shortcuts \
    rospatlite \
    rospilot \
    rosping \
    rospy \
    rospy-message-converter \
    rospy-tutorials \
    rosrt \
    rosserial \
    rosserial-arduino \
    rosserial-client \
    rosserial-embeddedlinux \
    rosserial-mbed \
    rosserial-msgs \
    rosserial-python \
    rosserial-server \
    rosserial-tivac \
    rosserial-vex-cortex \
    rosserial-vex-v5 \
    rosserial-windows \
    rosserial-xbee \
    rosservice \
    rostate-machine \
    rostest \
    rostime \
    rostopic \
    rostwitter \
    rosunit \
    roswtf \
    roswww \
    rotate-recovery \
    rplidar-ros \
    rqt \
    rqt-action \
    rqt-bag \
    rqt-bag-plugins \
    rqt-common-plugins \
    rqt-console \
    rqt-controller-manager \
    rqt-dep \
    rqt-graph \
    rqt-gui \
    rqt-gui-cpp \
    rqt-gui-py \
    rqt-image-view \
    rqt-joint-trajectory-controller \
    rqt-launch \
    rqt-logger-level \
    rqt-moveit \
    rqt-msg \
    rqt-multiplot \
    rqt-nav-view \
    rqt-plot \
    rqt-pose-view \
    rqt-publisher \
    rqt-py-common \
    rqt-py-console \
    rqt-py-trees \
    rqt-reconfigure \
    rqt-robot-dashboard \
    rqt-robot-monitor \
    rqt-robot-plugins \
    rqt-robot-steering \
    rqt-rosmon \
    rqt-runtime-monitor \
    rqt-rviz \
    rqt-service-caller \
    rqt-shell \
    rqt-srv \
    rqt-tf-tree \
    rqt-top \
    rqt-topic \
    rqt-web \
    rslidar \
    rslidar-driver \
    rslidar-msgs \
    rslidar-pointcloud \
    rtabmap \
    rtabmap-ros \
    rviz \
    rviz-imu-plugin \
    rviz-plugin-tutorials \
    rviz-python-tutorial \
    rviz-visual-tools \
    sainsmart-relay-usb \
    sbg-driver \
    sbpl \
    sbpl-lattice-planner \
    sbpl-recovery \
    scheduler-msgs \
    schunk-description \
    self-test \
    sensor-msgs \
    serial \
    settlerlib \
    shape-msgs \
    sick-scan \
    sick-tim \
    simple-grasping \
    simple-message \
    simulators \
    single-joint-position-action \
    slam-karto \
    slime-ros \
    slime-wrapper \
    smach \
    smach-msgs \
    smach-ros \
    smach-viewer \
    smclib \
    social-navigation-layers \
    socketcan-bridge \
    socketcan-interface \
    soem \
    sophus \
    sound-play \
    spacenav-node \
    sparse-bundle-adjustment \
    speech-recognition-msgs \
    srdfdom \
    stage \
    stage-ros \
    static-transform-mux \
    std-capabilities \
    std-msgs \
    std-srvs \
    stereo-image-proc \
    stereo-msgs \
    swri-console \
    swri-console-util \
    swri-dbw-interface \
    swri-geometry-util \
    swri-image-util \
    swri-math-util \
    swri-nodelet \
    swri-opencv-util \
    swri-prefix-tools \
    swri-roscpp \
    swri-rospy \
    swri-route-util \
    swri-serial-util \
    swri-string-util \
    swri-system-util \
    swri-transform-util \
    swri-yaml-util \
    talos-description \
    talos-description-calibration \
    talos-description-inertial \
    teb-local-planner \
    teb-local-planner-tutorials \
    teleop-tools \
    teleop-tools-msgs \
    teleop-twist-joy \
    teleop-twist-keyboard \
    test-diagnostic-aggregator \
    test-mavros \
    tf \
    tf-conversions \
    tf-remapper-cpp \
    tf2 \
    tf2-bullet \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-kdl \
    tf2-msgs \
    tf2-py \
    tf2-ros \
    tf2-sensor-msgs \
    tf2-tools \
    tf2-web-republisher \
    theora-image-transport \
    tile-map \
    timestamp-tools \
    topic-tools \
    towr \
    towr-ros \
    trac-ik \
    trac-ik-examples \
    trac-ik-kinematics-plugin \
    trac-ik-lib \
    trac-ik-python \
    trajectory-msgs \
    trajectory-tracker-msgs \
    trajectory-tracker-rviz-plugins \
    transmission-interface \
    tts \
    turtle-actionlib \
    turtle-tf \
    turtle-tf2 \
    turtlebot3 \
    turtlebot3-applications \
    turtlebot3-applications-msgs \
    turtlebot3-automatic-parking \
    turtlebot3-automatic-parking-vision \
    turtlebot3-autorace \
    turtlebot3-autorace-camera \
    turtlebot3-autorace-control \
    turtlebot3-autorace-core \
    turtlebot3-autorace-detect \
    turtlebot3-bringup \
    turtlebot3-description \
    turtlebot3-example \
    turtlebot3-fake \
    turtlebot3-follow-filter \
    turtlebot3-follower \
    turtlebot3-gazebo \
    turtlebot3-msgs \
    turtlebot3-navigation \
    turtlebot3-panorama \
    turtlebot3-simulations \
    turtlebot3-slam \
    turtlebot3-teleop \
    turtlesim \
    tuw-airskin-msgs \
    tuw-aruco \
    tuw-checkerboard \
    tuw-ellipses \
    tuw-gazebo-msgs \
    tuw-geometry \
    tuw-geometry-msgs \
    tuw-marker-detection \
    tuw-marker-pose-estimation \
    tuw-msgs \
    tuw-multi-robot-msgs \
    tuw-nav-msgs \
    tuw-object-msgs \
    tuw-vehicle-msgs \
    twist-mux \
    twist-mux-msgs \
    twist-recovery \
    um7 \
    unique-id \
    unique-identifier \
    urdf \
    urdf-geometry-parser \
    urdf-parser-plugin \
    urdf-sim-tutorial \
    urdf-test \
    urdf-tutorial \
    urdfdom-py \
    urg-c \
    urg-node \
    urg-stamped \
    usb-cam \
    usv-gazebo-plugins \
    uuid-msgs \
    uuv-assistants \
    uuv-auv-control-allocator \
    uuv-control-cascaded-pid \
    uuv-control-msgs \
    uuv-control-utils \
    uuv-descriptions \
    uuv-gazebo \
    uuv-gazebo-plugins \
    uuv-gazebo-ros-plugins \
    uuv-gazebo-ros-plugins-msgs \
    uuv-gazebo-worlds \
    uuv-sensor-ros-plugins \
    uuv-sensor-ros-plugins-msgs \
    uuv-simulator \
    uuv-teleop \
    uuv-thruster-manager \
    uuv-trajectory-control \
    uuv-world-plugins \
    uuv-world-ros-plugins \
    uuv-world-ros-plugins-msgs \
    uvc-camera \
    vapor-master \
    variant \
    variant-msgs \
    variant-topic-test \
    variant-topic-tools \
    velocity-controllers \
    velodyne \
    velodyne-description \
    velodyne-driver \
    velodyne-gazebo-plugins \
    velodyne-laserscan \
    velodyne-msgs \
    velodyne-pointcloud \
    velodyne-simulator \
    video-stream-opencv \
    view-controller-msgs \
    virtual-force-publisher \
    vision-msgs \
    vision-opencv \
    visp \
    visualization-marker-tutorials \
    visualization-msgs \
    visualization-tutorials \
    viz \
    volksbot-driver \
    voxel-grid \
    vrpn-client-ros \
    vrx-gazebo \
    wamv-description \
    wamv-gazebo \
    warehouse-ros \
    web-video-server \
    webkit-dependency \
    webrtc \
    webrtc-ros \
    wifi-ddwrt \
    wiimote \
    willow-maps \
    wu-ros-tools \
    xacro \
    xmlrpcpp \
    xpp \
    xpp-examples \
    xpp-hyq \
    xpp-msgs \
    xpp-quadrotor \
    xpp-states \
    xpp-vis \
    xsens-driver \
    xv-11-laser-driver \
    yocs-ar-marker-tracking \
    yocs-ar-pair-approach \
    yocs-ar-pair-tracking \
    yocs-cmd-vel-mux \
    yocs-controllers \
    yocs-diff-drive-pose-controller \
    yocs-joyop \
    yocs-keyop \
    yocs-localization-manager \
    yocs-math-toolkit \
    yocs-msgs \
    yocs-navigator \
    yocs-rapps \
    yocs-safety-controller \
    yocs-velocity-smoother \
    yocs-virtual-sensor \
    yocs-waypoint-provider \
    yocs-waypoints-navi \
    ypspur \
    ypspur-ros \
    yujin-ocs \
    zeroconf-msgs \
"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/packagegroups/packagegroup-ros-world-${ROS_DISTRO}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
