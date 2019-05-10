# crystal/generated-ros-distro.inc
# Generated by superflore -- DO NOT EDIT (except ROS_META_REVISION)
#
# Copyright 2019 Open Source Robotics Foundation

# Increment every time meta-ros is released because of a manually created change, ie, NOT as a result of a superflore run (which
# resets it to "0").
ROS_META_REVISION = "0"

ROS_SUPERFLORE_GENERATION_SCHEME = "1"

ROS_DISTRO_TYPE = "ros2"
ROS_VERSION = "2"
# DO NOT OVERRIDE ROS_PYTHON_VERSION
ROS_PYTHON_VERSION = "3"

# The last-modified timestamp in UTC of the upstream ROS_DISTRO-cache.yaml from which superflore generated the recipes. The date
# portion is used as the second version field of DISTRO_VERSION prior to the first release of a ROS_DISTRO.
ROS_SUPERFLORE_GENERATION_DATETIME = "20190522164514"

ROS_SUPERFLORE_GENERATION_SKIP_LIST = ""

# Superflore was unable to generate recipes for these packages, eg, because their repositories are not on GitHub.
ROS_SUPERFLORE_GENERATION_NOT_POSSIBLE = ""

# Number of commits that will be returned by "git log files/ROS_DISTRO-cache.yaml" when the generated files are committed. This is
# used for the third version field of DISTRO_VERSION.
ROS_NUM_CACHE_YAML_COMMITS = "1"

# Iterated values of ROS_DISTRO-cache.distribution_file.release_platforms.<LINUX-DISTRO>.[ <NAME> ... ] .
ROS_DISTRO_RELEASE_PLATFORMS = " \
    ubuntu-bionic \
"

ROS_SUPERFLORE_GENERATED_RECIPES = " \
    action-msgs \
    actionlib-msgs \
    ament-clang-format \
    ament-cmake \
    ament-cmake-auto \
    ament-cmake-clang-format \
    ament-cmake-copyright \
    ament-cmake-core \
    ament-cmake-cppcheck \
    ament-cmake-cpplint \
    ament-cmake-export-definitions \
    ament-cmake-export-dependencies \
    ament-cmake-export-include-directories \
    ament-cmake-export-interfaces \
    ament-cmake-export-libraries \
    ament-cmake-export-link-flags \
    ament-cmake-flake8 \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-cmake-include-directories \
    ament-cmake-libraries \
    ament-cmake-lint-cmake \
    ament-cmake-nose \
    ament-cmake-pclint \
    ament-cmake-pep257 \
    ament-cmake-pep8 \
    ament-cmake-pyflakes \
    ament-cmake-pytest \
    ament-cmake-python \
    ament-cmake-ros \
    ament-cmake-target-dependencies \
    ament-cmake-test \
    ament-cmake-uncrustify \
    ament-cmake-xmllint \
    ament-copyright \
    ament-cppcheck \
    ament-cpplint \
    ament-flake8 \
    ament-index-cpp \
    ament-index-python \
    ament-lint-auto \
    ament-lint-cmake \
    ament-lint-common \
    ament-package \
    ament-pclint \
    ament-pep257 \
    ament-pep8 \
    ament-pyflakes \
    ament-uncrustify \
    ament-xmllint \
    angles \
    apriltag \
    apriltag-msgs \
    apriltag2-node \
    behaviortree-cpp \
    behaviortree-cpp-v3 \
    builtin-interfaces \
    camera-calibration-parsers \
    camera-info-manager \
    cartographer \
    class-loader \
    common-interfaces \
    composition \
    compressed-depth-image-transport \
    compressed-image-transport \
    connext-cmake-module \
    console-bridge-vendor \
    control-msgs \
    costmap-queue \
    cv-bridge \
    demo-nodes-cpp \
    demo-nodes-cpp-rosnative \
    demo-nodes-py \
    depth-image-proc \
    depthimage-to-laserscan \
    desktop \
    diagnostic-msgs \
    dummy-map-server \
    dummy-robot-bringup \
    dummy-sensors \
    dwb-controller \
    dwb-core \
    dwb-critics \
    dwb-msgs \
    dwb-plugins \
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
    ecl-manipulators \
    ecl-math \
    ecl-mobile-robot \
    ecl-mpl \
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
    eigen-stl-containers \
    example-interfaces \
    examples-rclcpp-minimal-action-client \
    examples-rclcpp-minimal-action-server \
    examples-rclcpp-minimal-client \
    examples-rclcpp-minimal-composition \
    examples-rclcpp-minimal-publisher \
    examples-rclcpp-minimal-service \
    examples-rclcpp-minimal-subscriber \
    examples-rclcpp-minimal-timer \
    examples-rclpy-executors \
    examples-rclpy-minimal-action-client \
    examples-rclpy-minimal-action-server \
    examples-rclpy-minimal-client \
    examples-rclpy-minimal-publisher \
    examples-rclpy-minimal-service \
    examples-rclpy-minimal-subscriber \
    fastcdr \
    fastrtps \
    fastrtps-cmake-module \
    fmi-adapter \
    fmi-adapter-examples \
    gazebo-msgs \
    gazebo-plugins \
    gazebo-ros \
    gazebo-ros-pkgs \
    gazebo-rosdev \
    geometry-msgs \
    gmock-vendor \
    gtest-vendor \
    image-geometry \
    image-publisher \
    image-tools \
    image-transport \
    image-transport-plugins \
    intra-process-demo \
    joy \
    kdl-parser \
    keystroke \
    laser-geometry \
    launch \
    launch-ros \
    launch-testing \
    libcurl-vendor \
    librealsense2 \
    libyaml-vendor \
    lifecycle \
    lifecycle-msgs \
    logging-demo \
    map-msgs \
    message-filters \
    micro-ros-agent \
    micro-xrce-dds-agent \
    microxrcedds-agent-cmake-module \
    ml-classifiers \
    mrpt2 \
    nav-2d-msgs \
    nav-2d-utils \
    nav-msgs \
    nav2-amcl \
    nav2-bringup \
    nav2-bt-navigator \
    nav2-common \
    nav2-costmap-2d \
    nav2-dwb-controller \
    nav2-dynamic-params \
    nav2-map-server \
    nav2-mission-executor \
    nav2-motion-primitives \
    nav2-msgs \
    nav2-navfn-planner \
    nav2-robot \
    nav2-simple-navigator \
    nav2-tasks \
    nav2-util \
    nav2-voxel-grid \
    nav2-world-model \
    navigation2 \
    nmea-msgs \
    object-analytics-msgs \
    object-analytics-node \
    object-analytics-rviz \
    object-msgs \
    opensplice-cmake-module \
    orocos-kdl \
    osrf-pycommon \
    osrf-testing-tools-cpp \
    pcl-conversions \
    pendulum-control \
    pendulum-msgs \
    pluginlib \
    poco-vendor \
    py-trees \
    py-trees-ros-interfaces \
    python-cmake-module \
    python-qt-binding \
    qt-dotgraph \
    qt-gui \
    qt-gui-app \
    qt-gui-core \
    qt-gui-cpp \
    qt-gui-py-common \
    rcl \
    rcl-action \
    rcl-interfaces \
    rcl-lifecycle \
    rcl-logging-log4cxx \
    rcl-logging-noop \
    rcl-yaml-param-parser \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    rclpy \
    rcutils \
    realsense-camera-msgs \
    realsense-ros2-camera \
    resource-retriever \
    rmw \
    rmw-connext-cpp \
    rmw-connext-shared-cpp \
    rmw-fastrtps-cpp \
    rmw-fastrtps-dynamic-cpp \
    rmw-fastrtps-shared-cpp \
    rmw-implementation \
    rmw-implementation-cmake \
    rmw-opensplice-cpp \
    robot-state-publisher \
    ros-base \
    ros-core \
    ros-environment \
    ros-workspace \
    ros1-bridge \
    ros1-rosbag-storage-vendor \
    ros2bag \
    ros2cli \
    ros2launch \
    ros2lifecycle \
    ros2msg \
    ros2multicast \
    ros2node \
    ros2param \
    ros2pkg \
    ros2run \
    ros2service \
    ros2srv \
    ros2topic \
    rosbag2 \
    rosbag2-bag-v2-plugins \
    rosbag2-converter-default-plugins \
    rosbag2-storage \
    rosbag2-storage-default-plugins \
    rosbag2-test-common \
    rosbag2-tests \
    rosbag2-transport \
    rosgraph-msgs \
    rosidl-actions \
    rosidl-adapter \
    rosidl-cmake \
    rosidl-default-generators \
    rosidl-default-runtime \
    rosidl-generator-c \
    rosidl-generator-cpp \
    rosidl-generator-dds-idl \
    rosidl-generator-py \
    rosidl-parser \
    rosidl-typesupport-c \
    rosidl-typesupport-connext-c \
    rosidl-typesupport-connext-cpp \
    rosidl-typesupport-cpp \
    rosidl-typesupport-fastrtps-c \
    rosidl-typesupport-fastrtps-cpp \
    rosidl-typesupport-interface \
    rosidl-typesupport-introspection-c \
    rosidl-typesupport-introspection-cpp \
    rosidl-typesupport-opensplice-c \
    rosidl-typesupport-opensplice-cpp \
    rqt \
    rqt-action \
    rqt-console \
    rqt-graph \
    rqt-gui \
    rqt-gui-cpp \
    rqt-gui-py \
    rqt-image-view \
    rqt-msg \
    rqt-plot \
    rqt-publisher \
    rqt-py-common \
    rqt-py-console \
    rqt-service-caller \
    rqt-shell \
    rqt-srv \
    rqt-top \
    rqt-topic \
    rttest \
    rviz-assimp-vendor \
    rviz-common \
    rviz-default-plugins \
    rviz-ogre-vendor \
    rviz-rendering \
    rviz-rendering-tests \
    rviz-visual-testing-framework \
    rviz2 \
    sensor-msgs \
    shape-msgs \
    shared-queues-vendor \
    sophus \
    sqlite3-vendor \
    sros2 \
    sros2-cmake \
    std-msgs \
    std-srvs \
    stereo-msgs \
    system-modes \
    system-modes-examples \
    teleop-twist-joy \
    teleop-twist-keyboard \
    test-msgs \
    test-osrf-testing-tools-cpp \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    theora-image-transport \
    tinydir-vendor \
    tinyxml-vendor \
    tinyxml2-vendor \
    tlsf \
    tlsf-cpp \
    topic-monitor \
    trajectory-msgs \
    uncrustify-vendor \
    unique-identifier-msgs \
    urdf \
    urdfdom \
    urdfdom-headers \
    vision-opencv \
    visualization-msgs \
    yaml-cpp-vendor \
"

ROS_SUPERFLORE_GENERATED_RECIPE_BASENAMES = " \
    action-msgs_0.6.3 \
    actionlib-msgs_0.6.1 \
    ament-clang-format_0.6.4 \
    ament-cmake_0.6.1 \
    ament-cmake-auto_0.6.1 \
    ament-cmake-clang-format_0.6.4 \
    ament-cmake-copyright_0.6.4 \
    ament-cmake-core_0.6.1 \
    ament-cmake-cppcheck_0.6.4 \
    ament-cmake-cpplint_0.6.4 \
    ament-cmake-export-definitions_0.6.1 \
    ament-cmake-export-dependencies_0.6.1 \
    ament-cmake-export-include-directories_0.6.1 \
    ament-cmake-export-interfaces_0.6.1 \
    ament-cmake-export-libraries_0.6.1 \
    ament-cmake-export-link-flags_0.6.1 \
    ament-cmake-flake8_0.6.4 \
    ament-cmake-gmock_0.6.1 \
    ament-cmake-gtest_0.6.1 \
    ament-cmake-include-directories_0.6.1 \
    ament-cmake-libraries_0.6.1 \
    ament-cmake-lint-cmake_0.6.4 \
    ament-cmake-nose_0.6.1 \
    ament-cmake-pclint_0.6.4 \
    ament-cmake-pep257_0.6.4 \
    ament-cmake-pep8_0.6.4 \
    ament-cmake-pyflakes_0.6.4 \
    ament-cmake-pytest_0.6.1 \
    ament-cmake-python_0.6.1 \
    ament-cmake-ros_0.5.0 \
    ament-cmake-target-dependencies_0.6.1 \
    ament-cmake-test_0.6.1 \
    ament-cmake-uncrustify_0.6.4 \
    ament-cmake-xmllint_0.6.4 \
    ament-copyright_0.6.4 \
    ament-cppcheck_0.6.4 \
    ament-cpplint_0.6.4 \
    ament-flake8_0.6.4 \
    ament-index-cpp_0.5.1 \
    ament-index-python_0.5.1 \
    ament-lint-auto_0.6.4 \
    ament-lint-cmake_0.6.4 \
    ament-lint-common_0.6.4 \
    ament-package_0.6.0 \
    ament-pclint_0.6.4 \
    ament-pep257_0.6.4 \
    ament-pep8_0.6.4 \
    ament-pyflakes_0.6.4 \
    ament-uncrustify_0.6.4 \
    ament-xmllint_0.6.4 \
    angles_1.12.1-1 \
    apriltag_0.9.8-1 \
    apriltag-msgs_1.0.1 \
    apriltag2-node_1.0.1 \
    behaviortree-cpp_2.4.3-1 \
    behaviortree-cpp-v3_3.0.4 \
    builtin-interfaces_0.6.3 \
    camera-calibration-parsers_2.0.1 \
    camera-info-manager_2.0.1 \
    cartographer_1.0.0-1 \
    class-loader_1.2.0 \
    common-interfaces_0.6.1 \
    composition_0.6.2 \
    compressed-depth-image-transport_2.0.0 \
    compressed-image-transport_2.0.0 \
    connext-cmake-module_0.6.4 \
    console-bridge-vendor_1.1.0 \
    control-msgs_2.1.0 \
    costmap-queue_0.1.7 \
    cv-bridge_2.1.0 \
    demo-nodes-cpp_0.6.2 \
    demo-nodes-cpp-rosnative_0.6.2 \
    demo-nodes-py_0.6.2 \
    depth-image-proc_2.0.0 \
    depthimage-to-laserscan_2.2.1 \
    desktop_0.6.1 \
    diagnostic-msgs_0.6.1 \
    dummy-map-server_0.6.2 \
    dummy-robot-bringup_0.6.2 \
    dummy-sensors_0.6.2 \
    dwb-controller_0.1.7 \
    dwb-core_0.1.7 \
    dwb-critics_0.1.7 \
    dwb-msgs_0.1.7 \
    dwb-plugins_0.1.7 \
    ecl-build_1.0.1-1 \
    ecl-command-line_1.0.1 \
    ecl-concepts_1.0.1 \
    ecl-config_1.0.1 \
    ecl-console_1.0.1 \
    ecl-containers_1.0.1 \
    ecl-converters_1.0.1 \
    ecl-converters-lite_1.0.1 \
    ecl-core_1.0.1 \
    ecl-core-apps_1.0.1 \
    ecl-devices_1.0.1 \
    ecl-eigen_1.0.1 \
    ecl-errors_1.0.1 \
    ecl-exceptions_1.0.1 \
    ecl-filesystem_1.0.1 \
    ecl-formatters_1.0.1 \
    ecl-geometry_1.0.1 \
    ecl-io_1.0.1 \
    ecl-ipc_1.0.1 \
    ecl-license_1.0.1-1 \
    ecl-linear-algebra_1.0.1 \
    ecl-lite_1.0.1 \
    ecl-manipulators_1.0.1 \
    ecl-math_1.0.1 \
    ecl-mobile-robot_1.0.1 \
    ecl-mpl_1.0.1 \
    ecl-sigslots_1.0.1 \
    ecl-sigslots-lite_1.0.1 \
    ecl-statistics_1.0.1 \
    ecl-streams_1.0.1 \
    ecl-threads_1.0.1 \
    ecl-time_1.0.1 \
    ecl-time-lite_1.0.1 \
    ecl-tools_1.0.1-1 \
    ecl-type-traits_1.0.1 \
    ecl-utilities_1.0.1 \
    eigen-stl-containers_1.0.0 \
    example-interfaces_0.6.2 \
    examples-rclcpp-minimal-action-client_0.6.3 \
    examples-rclcpp-minimal-action-server_0.6.3 \
    examples-rclcpp-minimal-client_0.6.3 \
    examples-rclcpp-minimal-composition_0.6.3 \
    examples-rclcpp-minimal-publisher_0.6.3 \
    examples-rclcpp-minimal-service_0.6.3 \
    examples-rclcpp-minimal-subscriber_0.6.3 \
    examples-rclcpp-minimal-timer_0.6.3 \
    examples-rclpy-executors_0.6.3 \
    examples-rclpy-minimal-action-client_0.6.3 \
    examples-rclpy-minimal-action-server_0.6.3 \
    examples-rclpy-minimal-client_0.6.3 \
    examples-rclpy-minimal-publisher_0.6.3 \
    examples-rclpy-minimal-service_0.6.3 \
    examples-rclpy-minimal-subscriber_0.6.3 \
    fastcdr_1.0.8 \
    fastrtps_1.7.2 \
    fastrtps-cmake-module_0.6.1 \
    fmi-adapter_0.1.3 \
    fmi-adapter-examples_0.1.3 \
    gazebo-msgs_3.2.0 \
    gazebo-plugins_3.2.0 \
    gazebo-ros_3.2.0 \
    gazebo-ros-pkgs_3.2.0 \
    gazebo-rosdev_3.2.0 \
    geometry-msgs_0.6.1 \
    gmock-vendor_1.8.0 \
    gtest-vendor_1.8.0 \
    image-geometry_2.1.0 \
    image-publisher_2.0.0 \
    image-tools_0.6.2 \
    image-transport_2.0.1 \
    image-transport-plugins_2.0.0 \
    intra-process-demo_0.6.2 \
    joy_2.2.1-1 \
    kdl-parser_2.2.0 \
    keystroke_0.3.0-2 \
    laser-geometry_2.0.0 \
    launch_0.7.4 \
    launch-ros_0.7.4 \
    launch-testing_0.7.4 \
    libcurl-vendor_2.1.0 \
    librealsense2_2.16.5-2 \
    libyaml-vendor_1.0.0 \
    lifecycle_0.6.2 \
    lifecycle-msgs_0.6.3 \
    logging-demo_0.6.2 \
    map-msgs_2.0.1 \
    message-filters_3.0.0 \
    micro-ros-agent_0.0.1-2 \
    micro-xrce-dds-agent_1.0.3-1 \
    microxrcedds-agent-cmake-module_0.0.1-2 \
    ml-classifiers_1.0.1-1 \
    mrpt2_1.9.9 \
    nav-2d-msgs_0.1.7 \
    nav-2d-utils_0.1.7 \
    nav-msgs_0.6.1 \
    nav2-amcl_0.1.7 \
    nav2-bringup_0.1.7 \
    nav2-bt-navigator_0.1.7 \
    nav2-common_0.1.7 \
    nav2-costmap-2d_0.1.7 \
    nav2-dwb-controller_0.1.7 \
    nav2-dynamic-params_0.1.7 \
    nav2-map-server_0.1.7 \
    nav2-mission-executor_0.1.7 \
    nav2-motion-primitives_0.1.7 \
    nav2-msgs_0.1.7 \
    nav2-navfn-planner_0.1.7 \
    nav2-robot_0.1.7 \
    nav2-simple-navigator_0.1.7 \
    nav2-tasks_0.1.7 \
    nav2-util_0.1.7 \
    nav2-voxel-grid_0.1.7 \
    nav2-world-model_0.1.7 \
    navigation2_0.1.7 \
    nmea-msgs_2.0.0-1 \
    object-analytics-msgs_0.5.3 \
    object-analytics-node_0.5.3 \
    object-analytics-rviz_0.5.3 \
    object-msgs_0.3.0-1 \
    opensplice-cmake-module_0.6.2 \
    orocos-kdl_3.1.0 \
    osrf-pycommon_0.1.6 \
    osrf-testing-tools-cpp_1.1.0 \
    pcl-conversions_2.0.0 \
    pendulum-control_0.6.2 \
    pendulum-msgs_0.6.2 \
    pluginlib_2.2.1 \
    poco-vendor_1.1.1 \
    py-trees_1.2.0-1 \
    py-trees-ros-interfaces_1.1.1-1 \
    python-cmake-module_0.6.3 \
    python-qt-binding_1.0.1 \
    qt-dotgraph_1.0.4 \
    qt-gui_1.0.4 \
    qt-gui-app_1.0.4 \
    qt-gui-core_1.0.4 \
    qt-gui-cpp_1.0.4 \
    qt-gui-py-common_1.0.4 \
    rcl_0.6.5 \
    rcl-action_0.6.5 \
    rcl-interfaces_0.6.3 \
    rcl-lifecycle_0.6.5 \
    rcl-logging-log4cxx_0.2.0 \
    rcl-logging-noop_0.2.0 \
    rcl-yaml-param-parser_0.6.5 \
    rclcpp_0.6.4 \
    rclcpp-action_0.6.4 \
    rclcpp-lifecycle_0.6.4 \
    rclpy_0.6.4 \
    rcutils_0.6.2 \
    realsense-camera-msgs_2.0.3 \
    realsense-ros2-camera_2.0.3 \
    resource-retriever_2.1.0 \
    rmw_0.6.1 \
    rmw-connext-cpp_0.6.1 \
    rmw-connext-shared-cpp_0.6.1 \
    rmw-fastrtps-cpp_0.6.2 \
    rmw-fastrtps-dynamic-cpp_0.6.2 \
    rmw-fastrtps-shared-cpp_0.6.2 \
    rmw-implementation_0.6.1 \
    rmw-implementation-cmake_0.6.1 \
    rmw-opensplice-cpp_0.6.3 \
    robot-state-publisher_2.1.0 \
    ros-base_0.6.1 \
    ros-core_0.6.1 \
    ros-environment_2.2.0 \
    ros-workspace_0.6.1 \
    ros1-bridge_0.6.2-2 \
    ros1-rosbag-storage-vendor_0.0.7 \
    ros2bag_0.0.7 \
    ros2cli_0.6.3 \
    ros2launch_0.7.4 \
    ros2lifecycle_0.6.3 \
    ros2msg_0.6.3 \
    ros2multicast_0.6.3 \
    ros2node_0.6.3 \
    ros2param_0.6.3 \
    ros2pkg_0.6.3 \
    ros2run_0.6.3 \
    ros2service_0.6.3 \
    ros2srv_0.6.3 \
    ros2topic_0.6.3 \
    rosbag2_0.0.7 \
    rosbag2-bag-v2-plugins_0.0.7 \
    rosbag2-converter-default-plugins_0.0.7 \
    rosbag2-storage_0.0.7 \
    rosbag2-storage-default-plugins_0.0.7 \
    rosbag2-test-common_0.0.7 \
    rosbag2-tests_0.0.7 \
    rosbag2-transport_0.0.7 \
    rosgraph-msgs_0.6.3 \
    rosidl-actions_0.6.3 \
    rosidl-adapter_0.6.3 \
    rosidl-cmake_0.6.3 \
    rosidl-default-generators_0.6.0 \
    rosidl-default-runtime_0.6.0 \
    rosidl-generator-c_0.6.3 \
    rosidl-generator-cpp_0.6.3 \
    rosidl-generator-dds-idl_0.6.0 \
    rosidl-generator-py_0.6.3 \
    rosidl-parser_0.6.3 \
    rosidl-typesupport-c_0.6.3 \
    rosidl-typesupport-connext-c_0.6.4 \
    rosidl-typesupport-connext-cpp_0.6.4 \
    rosidl-typesupport-cpp_0.6.3 \
    rosidl-typesupport-fastrtps-c_0.6.1 \
    rosidl-typesupport-fastrtps-cpp_0.6.1 \
    rosidl-typesupport-interface_0.6.3 \
    rosidl-typesupport-introspection-c_0.6.3 \
    rosidl-typesupport-introspection-cpp_0.6.3 \
    rosidl-typesupport-opensplice-c_0.6.2 \
    rosidl-typesupport-opensplice-cpp_0.6.2 \
    rqt_1.0.2 \
    rqt-action_1.0.1 \
    rqt-console_1.0.1 \
    rqt-graph_1.0.0 \
    rqt-gui_1.0.2 \
    rqt-gui-cpp_1.0.2 \
    rqt-gui-py_1.0.2 \
    rqt-image-view_1.0.0 \
    rqt-msg_1.0.1 \
    rqt-plot_1.0.2 \
    rqt-publisher_1.0.3 \
    rqt-py-common_1.0.2 \
    rqt-py-console_1.0.0-2 \
    rqt-service-caller_1.0.1 \
    rqt-shell_1.0.0 \
    rqt-srv_1.0.1 \
    rqt-top_1.0.0 \
    rqt-topic_1.0.0 \
    rttest_0.6.0 \
    rviz-assimp-vendor_5.1.0 \
    rviz-common_5.1.0 \
    rviz-default-plugins_5.1.0 \
    rviz-ogre-vendor_5.1.0 \
    rviz-rendering_5.1.0 \
    rviz-rendering-tests_5.1.0 \
    rviz-visual-testing-framework_5.1.0 \
    rviz2_5.1.0 \
    sensor-msgs_0.6.1 \
    shape-msgs_0.6.1 \
    shared-queues-vendor_0.0.7 \
    sophus_1.0.2 \
    sqlite3-vendor_0.0.7 \
    sros2_0.6.3 \
    sros2-cmake_0.6.3 \
    std-msgs_0.6.1 \
    std-srvs_0.6.1 \
    stereo-msgs_0.6.1 \
    system-modes_0.1.2 \
    system-modes-examples_0.1.2 \
    teleop-twist-joy_2.1.1 \
    teleop-twist-keyboard_2.2.0 \
    test-msgs_0.6.3 \
    test-osrf-testing-tools-cpp_1.1.0 \
    tf2_0.10.1 \
    tf2-eigen_0.10.1 \
    tf2-geometry-msgs_0.10.1 \
    tf2-msgs_0.10.1 \
    tf2-ros_0.10.1 \
    tf2-sensor-msgs_0.10.1 \
    theora-image-transport_2.0.0 \
    tinydir-vendor_1.0.1 \
    tinyxml-vendor_0.5.0 \
    tinyxml2-vendor_0.6.1 \
    tlsf_0.5.0 \
    tlsf-cpp_0.6.0 \
    topic-monitor_0.6.2 \
    trajectory-msgs_0.6.1 \
    uncrustify-vendor_1.1.0 \
    unique-identifier-msgs_2.0.0 \
    urdf_2.2.0 \
    urdfdom_2.1.0 \
    urdfdom-headers_1.0.2-1 \
    vision-opencv_2.1.0 \
    visualization-msgs_0.6.1 \
    yaml-cpp-vendor_5.0.0 \
"

# What's built by packagegroup-ros-world. Does not include packages that appear solely in ROS_SUPERFLORE_GENERATED_BUILDTOOLS
# (with a -native suffix) or ROS_SUPERFLORE_GENERATED_TESTS.
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES = " \
    action-msgs \
    actionlib-msgs \
    ament-clang-format \
    ament-cmake \
    ament-cmake-auto \
    ament-cmake-clang-format \
    ament-cmake-copyright \
    ament-cmake-core \
    ament-cmake-cppcheck \
    ament-cmake-cpplint \
    ament-cmake-export-definitions \
    ament-cmake-export-dependencies \
    ament-cmake-export-include-directories \
    ament-cmake-export-interfaces \
    ament-cmake-export-libraries \
    ament-cmake-export-link-flags \
    ament-cmake-flake8 \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-cmake-include-directories \
    ament-cmake-libraries \
    ament-cmake-lint-cmake \
    ament-cmake-nose \
    ament-cmake-pclint \
    ament-cmake-pep257 \
    ament-cmake-pep8 \
    ament-cmake-pyflakes \
    ament-cmake-pytest \
    ament-cmake-python \
    ament-cmake-ros \
    ament-cmake-target-dependencies \
    ament-cmake-test \
    ament-cmake-uncrustify \
    ament-cmake-xmllint \
    ament-copyright \
    ament-cppcheck \
    ament-cpplint \
    ament-flake8 \
    ament-index-cpp \
    ament-index-python \
    ament-lint-auto \
    ament-lint-cmake \
    ament-lint-common \
    ament-package \
    ament-pclint \
    ament-pep257 \
    ament-pep8 \
    ament-pyflakes \
    ament-uncrustify \
    ament-xmllint \
    angles \
    apriltag \
    apriltag-msgs \
    apriltag2-node \
    behaviortree-cpp \
    behaviortree-cpp-v3 \
    builtin-interfaces \
    camera-calibration-parsers \
    camera-info-manager \
    cartographer \
    class-loader \
    common-interfaces \
    composition \
    compressed-depth-image-transport \
    compressed-image-transport \
    connext-cmake-module \
    console-bridge-vendor \
    control-msgs \
    costmap-queue \
    cv-bridge \
    demo-nodes-cpp \
    demo-nodes-cpp-rosnative \
    demo-nodes-py \
    depth-image-proc \
    depthimage-to-laserscan \
    desktop \
    diagnostic-msgs \
    dummy-map-server \
    dummy-robot-bringup \
    dummy-sensors \
    dwb-controller \
    dwb-core \
    dwb-critics \
    dwb-msgs \
    dwb-plugins \
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
    ecl-manipulators \
    ecl-math \
    ecl-mobile-robot \
    ecl-mpl \
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
    eigen-stl-containers \
    example-interfaces \
    examples-rclcpp-minimal-action-client \
    examples-rclcpp-minimal-action-server \
    examples-rclcpp-minimal-client \
    examples-rclcpp-minimal-composition \
    examples-rclcpp-minimal-publisher \
    examples-rclcpp-minimal-service \
    examples-rclcpp-minimal-subscriber \
    examples-rclcpp-minimal-timer \
    examples-rclpy-executors \
    examples-rclpy-minimal-action-client \
    examples-rclpy-minimal-action-server \
    examples-rclpy-minimal-client \
    examples-rclpy-minimal-publisher \
    examples-rclpy-minimal-service \
    examples-rclpy-minimal-subscriber \
    fastcdr \
    fastrtps \
    fastrtps-cmake-module \
    fmi-adapter \
    fmi-adapter-examples \
    gazebo-msgs \
    gazebo-plugins \
    gazebo-ros \
    gazebo-ros-pkgs \
    gazebo-rosdev \
    geometry-msgs \
    gmock-vendor \
    gtest-vendor \
    image-geometry \
    image-publisher \
    image-tools \
    image-transport \
    image-transport-plugins \
    intra-process-demo \
    joy \
    kdl-parser \
    keystroke \
    laser-geometry \
    launch \
    launch-ros \
    launch-testing \
    libcurl-vendor \
    librealsense2 \
    libyaml-vendor \
    lifecycle \
    lifecycle-msgs \
    logging-demo \
    map-msgs \
    message-filters \
    micro-ros-agent \
    micro-xrce-dds-agent \
    microxrcedds-agent-cmake-module \
    ml-classifiers \
    mrpt2 \
    nav-2d-msgs \
    nav-2d-utils \
    nav-msgs \
    nav2-amcl \
    nav2-bringup \
    nav2-bt-navigator \
    nav2-common \
    nav2-costmap-2d \
    nav2-dwb-controller \
    nav2-dynamic-params \
    nav2-map-server \
    nav2-mission-executor \
    nav2-motion-primitives \
    nav2-msgs \
    nav2-navfn-planner \
    nav2-robot \
    nav2-simple-navigator \
    nav2-tasks \
    nav2-util \
    nav2-voxel-grid \
    nav2-world-model \
    navigation2 \
    nmea-msgs \
    object-analytics-msgs \
    object-analytics-node \
    object-analytics-rviz \
    object-msgs \
    opensplice-cmake-module \
    orocos-kdl \
    osrf-pycommon \
    osrf-testing-tools-cpp \
    pcl-conversions \
    pendulum-control \
    pendulum-msgs \
    pluginlib \
    poco-vendor \
    py-trees \
    py-trees-ros-interfaces \
    python-cmake-module \
    python-qt-binding \
    qt-dotgraph \
    qt-gui \
    qt-gui-app \
    qt-gui-core \
    qt-gui-cpp \
    qt-gui-py-common \
    rcl \
    rcl-action \
    rcl-interfaces \
    rcl-lifecycle \
    rcl-logging-log4cxx \
    rcl-logging-noop \
    rcl-yaml-param-parser \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    rclpy \
    rcutils \
    realsense-camera-msgs \
    realsense-ros2-camera \
    resource-retriever \
    rmw \
    rmw-connext-cpp \
    rmw-connext-shared-cpp \
    rmw-fastrtps-cpp \
    rmw-fastrtps-dynamic-cpp \
    rmw-fastrtps-shared-cpp \
    rmw-implementation \
    rmw-implementation-cmake \
    rmw-opensplice-cpp \
    robot-state-publisher \
    ros-base \
    ros-core \
    ros-environment \
    ros-workspace \
    ros1-bridge \
    ros1-rosbag-storage-vendor \
    ros2bag \
    ros2cli \
    ros2launch \
    ros2lifecycle \
    ros2msg \
    ros2multicast \
    ros2node \
    ros2param \
    ros2pkg \
    ros2run \
    ros2service \
    ros2srv \
    ros2topic \
    rosbag2 \
    rosbag2-bag-v2-plugins \
    rosbag2-converter-default-plugins \
    rosbag2-storage \
    rosbag2-storage-default-plugins \
    rosbag2-test-common \
    rosbag2-tests \
    rosbag2-transport \
    rosgraph-msgs \
    rosidl-actions \
    rosidl-adapter \
    rosidl-cmake \
    rosidl-default-generators \
    rosidl-default-runtime \
    rosidl-generator-c \
    rosidl-generator-cpp \
    rosidl-generator-dds-idl \
    rosidl-generator-py \
    rosidl-parser \
    rosidl-typesupport-c \
    rosidl-typesupport-connext-c \
    rosidl-typesupport-connext-cpp \
    rosidl-typesupport-cpp \
    rosidl-typesupport-fastrtps-c \
    rosidl-typesupport-fastrtps-cpp \
    rosidl-typesupport-interface \
    rosidl-typesupport-introspection-c \
    rosidl-typesupport-introspection-cpp \
    rosidl-typesupport-opensplice-c \
    rosidl-typesupport-opensplice-cpp \
    rqt \
    rqt-action \
    rqt-console \
    rqt-graph \
    rqt-gui \
    rqt-gui-cpp \
    rqt-gui-py \
    rqt-image-view \
    rqt-msg \
    rqt-plot \
    rqt-publisher \
    rqt-py-common \
    rqt-py-console \
    rqt-service-caller \
    rqt-shell \
    rqt-srv \
    rqt-top \
    rqt-topic \
    rttest \
    rviz-assimp-vendor \
    rviz-common \
    rviz-default-plugins \
    rviz-ogre-vendor \
    rviz-rendering \
    rviz-rendering-tests \
    rviz-visual-testing-framework \
    rviz2 \
    sensor-msgs \
    shape-msgs \
    shared-queues-vendor \
    sophus \
    sqlite3-vendor \
    sros2 \
    sros2-cmake \
    std-msgs \
    std-srvs \
    stereo-msgs \
    system-modes \
    system-modes-examples \
    teleop-twist-joy \
    teleop-twist-keyboard \
    test-msgs \
    test-osrf-testing-tools-cpp \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    theora-image-transport \
    tinydir-vendor \
    tinyxml-vendor \
    tinyxml2-vendor \
    tlsf \
    tlsf-cpp \
    topic-monitor \
    trajectory-msgs \
    uncrustify-vendor \
    unique-identifier-msgs \
    urdf \
    urdfdom \
    urdfdom-headers \
    vision-opencv \
    visualization-msgs \
    yaml-cpp-vendor \
"

# Packages found in the <buildtool_depend> and <buildtool_export_depend> items, ie, ones for which a -native is built. Does not
# include those found in the ROS_EXEC_DEPENDS values in the recipes of build tools.
ROS_SUPERFLORE_GENERATED_BUILDTOOLS = " \
    ament-clang-format-native \
    ament-cmake-auto-native \
    ament-cmake-core-native \
    ament-cmake-export-definitions-native \
    ament-cmake-export-dependencies-native \
    ament-cmake-export-include-directories-native \
    ament-cmake-export-interfaces-native \
    ament-cmake-export-libraries-native \
    ament-cmake-export-link-flags-native \
    ament-cmake-gtest-native \
    ament-cmake-include-directories-native \
    ament-cmake-libraries-native \
    ament-cmake-native \
    ament-cmake-python-native \
    ament-cmake-ros-native \
    ament-cmake-target-dependencies-native \
    ament-cmake-test-native \
    ament-copyright-native \
    ament-cppcheck-native \
    ament-cpplint-native \
    ament-flake8-native \
    ament-index-python-native \
    ament-lint-cmake-native \
    ament-package-native \
    ament-pclint-native \
    ament-pep257-native \
    ament-pep8-native \
    ament-pyflakes-native \
    ament-uncrustify-native \
    ament-xmllint-native \
    cmake-native \
    connext-cmake-module-native \
    fastcdr-native \
    fastrtps-cmake-module-native \
    fastrtps-native \
    git-native \
    gmock-vendor-native \
    gtest-native \
    gtest-vendor-native \
    libopensplice69-native \
    opensplice-cmake-module-native \
    pkgconfig-native \
    python-cmake-module-native \
    python3-catkin-pkg-native \
    python3-empy-native \
    python3-native \
    python3-nose-native \
    python3-pytest-native \
    rcutils-native \
    ros-environment-native \
    rosidl-cmake-native \
    rosidl-default-generators-native \
    rosidl-generator-c-native \
    rosidl-generator-cpp-native \
    rosidl-generator-dds-idl-native \
    rosidl-generator-py-native \
    rosidl-parser-native \
    rosidl-typesupport-c-native \
    rosidl-typesupport-connext-cpp-native \
    rosidl-typesupport-cpp-native \
    rosidl-typesupport-fastrtps-cpp-native \
    rosidl-typesupport-interface-native \
    rosidl-typesupport-introspection-c-native \
    rosidl-typesupport-introspection-cpp-native \
    rosidl-typesupport-opensplice-cpp-native \
    rti-connext-dds-5.3.1-native \
"

ROS_SUPERFLORE_GENERATED_PLATFORM_PACKAGE_DEPENDENCIES = " \
    ${PYTHON_PN}-pydocstyle \
    ${PYTHON_PN}-pyflakes \
    ${PYTHON_PN}-sphinx \
    asio \
    assimp \
    boost \
    bullet \
    bzip2 \
    cairo \
    ceres-solver \
    clang-format \
    cmake \
    console-bridge \
    cppcheck \
    cppunit \
    curl \
    elfutils \
    ffmpeg \
    freeglut \
    freetype \
    gflags \
    git \
    glfw \
    glog \
    gpgme \
    gtest \
    gtk+3 \
    libeigen \
    libgazebo9 \
    libjpeq-turbo \
    libogg \
    libopensplice69 \
    libpcap \
    libpcre \
    libsdl \
    libsdl-image \
    libtheora \
    libtinyxml \
    libtinyxml2 \
    libusb1 \
    libx11 \
    libxaw \
    libxml2 \
    libxrandr \
    libyaml \
    log4cxx \
    lua \
    mesa \
    opencv \
    openssl \
    pcl \
    pkgconfig \
    poco \
    protobuf \
    python3 \
    python3-catkin-pkg \
    python3-empy \
    python3-flake8 \
    python3-lark-parser \
    python3-lxml \
    python3-matplotlib \
    python3-mock \
    python3-nose \
    python3-nose-yanc \
    python3-numpy \
    python3-pep8 \
    python3-psutil \
    python3-pydot \
    python3-pygraphviz \
    python3-pyqt5 \
    python3-pytest \
    python3-pyyaml \
    python3-setuptools \
    qtbase \
    rti-connext-dds-5.3.1 \
    sqlite3 \
    suitesparse \
    tango-icon-theme \
    udev \
    uncrustify \
    virtual/kernel \
    wxwidgets \
    zeromq \
    zlib \
"

# Packages found only in <test_depend> items. Does not include those found only in the ROS_*_DEPENDS of recipes of tests.
ROS_SUPERFLORE_GENERATED_TESTS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    ament-pep8 \
    cppunit \
    osrf-testing-tools-cpp \
    python-cmake-module \
    python3-nose \
    python3-nose-yanc \
    python3-pygraphviz \
    python3-pytest \
    rmw-fastrtps-dynamic-cpp \
    ros2bag \
    rosbag2-bag-v2-plugins \
    rosbag2-converter-default-plugins \
    rosbag2-storage-default-plugins \
    rosbag2-test-common \
    rviz-rendering-tests \
    rviz-visual-testing-framework \
    test-msgs \
"

ROS_SUPERFLORE_GENERATED_RECIPES_FOR_COMPONENTS = " \
    ament-cmake \
    ament-cmake-ros \
    ament-index \
    ament-lint \
    ament-package \
    angles \
    apriltag2 \
    apriltag2-node \
    behaviortree-cpp \
    behaviotree-cpp-v3 \
    cartographer \
    class-loader \
    common-interfaces \
    console-bridge-vendor \
    control-msgs \
    demos \
    depthimage-to-laserscan \
    ecl-core \
    ecl-lite \
    ecl-tools \
    eigen-stl-containers \
    example-interfaces \
    examples \
    fastcdr \
    fastrtps \
    fmi-adapter-ros2 \
    gazebo-ros-pkgs \
    geometry2 \
    googletest \
    image-common \
    image-pipeline \
    image-transport-plugins \
    joystick-drivers \
    kdl-parser \
    keystroke \
    laser-geometry \
    launch \
    librealsense \
    libyaml-vendor \
    message-filters \
    micro-ros-agent \
    micro-xrce-dds-agent \
    ml-classifiers \
    mrpt2 \
    navigation-msgs \
    navigation2 \
    nmea-msgs \
    object-msgs \
    orocos-kinematics-dynamics \
    osrf-pycommon \
    osrf-testing-tools-cpp \
    pcl-conversions \
    pluginlib \
    poco-vendor \
    py-trees \
    py-trees-ros-interfaces \
    python-qt-binding \
    qt-gui-core \
    rcl \
    rcl-interfaces \
    rcl-logging \
    rclcpp \
    rclpy \
    rcutils \
    realtime-support \
    resource-retriever \
    rmw \
    rmw-connext \
    rmw-fastrtps \
    rmw-implementation \
    rmw-opensplice \
    robot-state-publisher \
    ros-environment \
    ros-workspace \
    ros1-bridge \
    ros2-intel-realsense \
    ros2-object-analytics \
    ros2cli \
    rosbag2 \
    rosidl \
    rosidl-dds \
    rosidl-defaults \
    rosidl-python \
    rosidl-typesupport \
    rosidl-typesupport-connext \
    rosidl-typesupport-fastrtps \
    rosidl-typesupport-opensplice \
    rqt \
    rqt-action \
    rqt-console \
    rqt-graph \
    rqt-image-view \
    rqt-msg \
    rqt-plot \
    rqt-publisher \
    rqt-py-console \
    rqt-service-caller \
    rqt-shell \
    rqt-srv \
    rqt-top \
    rqt-topic \
    rviz \
    sophus \
    sros2 \
    system-modes \
    teleop-twist-joy \
    teleop-twist-keyboard \
    tinydir-vendor \
    tinyxml-vendor \
    tinyxml2-vendor \
    tlsf \
    uncrustify-vendor \
    unique-identifier-msgs \
    urdf \
    urdfdom \
    urdfdom-headers \
    variants \
    vision-opencv \
    yaml-cpp-vendor \
"