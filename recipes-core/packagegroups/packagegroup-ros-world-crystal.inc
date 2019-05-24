# Copyright (c) 2019 LG Electronics, Inc.

# Can't build these until we figure out how to build clang-format without building all of clang.
RDEPENDS_${PN}_remove = "ament-clang-format"
RDEPENDS_${PN}_remove = "ament-cmake-clang-format"

# Not used by "crystal"; this allows us to defer fixing log4cxx v0.10.0-13 until working on "melodic".
RDEPENDS_${PN}_remove = "rcl-logging-log4cxx"

# | CMake Error at .../cartographer/1.0.0-1-r0/recipe-sysroot/usr/lib/cmake/Ceres/CeresConfig.cmake:88 (message):
# |   Failed to find Ceres - Missing requested Ceres components: [SuiteSparse]
# |   (components requested: [SuiteSparse]).  Detected Ceres version: 1.14.0
# |   installed in:
# |   .../cartographer/1.0.0-1-r0/recipe-sysroot/usr
# |   with components: [EigenSparse, SparseLinearAlgebraLibrary,
# |   SchurSpecializations, OpenMP, Multithreading].
RDEPENDS_${PN}_remove = "cartographer"

# CMake Error at .../ml-classifiers/1.0.1-1-r0/recipe-sysroot/usr/share/rosidl_typesupport_c/cmake/get_used_typesupports.cmake:28 (message):
#   No RMW implementations found
# Call Stack (most recent call first):
#   .../ml-classifiers/1.0.1-1-r0/recipe-sysroot/usr/share/rosidl_typesupport_cpp/cmake/rosidl_typesupport_cpp_generate_interfaces.cmake:83 (get_used_typesupports)
#   .../ml-classifiers/1.0.1-1-r0/recipe-sysroot/usr/share/ament_cmake_core/cmake/core/ament_execute_extensions.cmake:38 (include)
#   .../ml-classifiers/1.0.1-1-r0/recipe-sysroot/usr/share/rosidl_cmake/cmake/rosidl_generate_interfaces.cmake:280 (ament_execute_extensions)
#   CMakeLists.txt:86 (rosidl_generate_interfaces)
RDEPENDS_${PN}_remove = "ml-classifiers"

# do_configure() failed:
# Log data follows:
# DEBUG: Executing shell function do_configure
# Traceback (most recent call last):
#   File "setup.py", line 7, in <module>
#     package = ElementTree.parse(here / 'package.xml')
#   File "/mnt/disk2/YOCTO-ARTIFACTS/BUILD-1/tmp-glibc/work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/keystroke/0.3.0-1-r0/recipe-sysroot-native/usr/lib/python3.5/xml/etree/ElementTree.py", line 1195, in parse
#     tree.parse(source, parser)
#   File "/mnt/disk2/YOCTO-ARTIFACTS/BUILD-1/tmp-glibc/work/cortexa7t2hf-neon-vfpv4-oe-linux-gnueabi/keystroke/0.3.0-1-r0/recipe-sysroot-native/usr/lib/python3.5/xml/etree/ElementTree.py", line 585, in parse
#     source = open(source, "rb")
# TypeError: invalid file: PosixPath('package.xml')
# WARNING: exit code 1 from a shell command.
RDEPENDS_${PN}_remove = "keystroke"

# do_compile() failed to build .a:
# NOTE: VERBOSE=1 cmake --build .../fmi-adapter/0.1.4-1-r0/build --target all -- -j 24
# ninja: error: 'FMILibraryProject-prefix/src/install/lib/libfmilib.a', needed by 'libfmi_adapter.so', missing and no known rule to make it
# WARNING: exit code 1 from a shell command.
# ERROR: Function failed: do_compile
RDEPENDS_${PN}_remove = "fmi-adapter"
RDEPENDS_${PN}_remove = "fmi-adapter-examples"


# OE won't let us build ffmpeg unless LICENSE_FLAGS_WHITELIST contains "commerical".
RDEPENDS_${PN}_remove = "${@bb.utils.contains('LICENSE_FLAGS_WHITELIST', 'commercial', '', 'ffmpeg', d)}"

# behaviortree-cpp-v3 and navigation2 are mutually exclusive because several of its packages depend on behaviortree-cpp.
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'behaviortree-cpp', 'behaviortree-cpp-v3', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'costmap-queue', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'dwb-controller', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'dwb-core', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'dwb-critics', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'dwb-msgs', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'dwb-plugins', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav-2d-msgs', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav-2d-utils', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-amcl', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-bringup', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-bt-navigator', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-common', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-costmap-2d', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-dwb-controller', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-dynamic-params', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-map-server', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-mission-executor', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-motion-primitives', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-msgs', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-navfn-planner', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-robot', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-simple-navigator', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-tasks', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-util', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-voxel-grid', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-world-model', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'navigation2', '', d)}"

# desktop RDEPENDS on rviz packages.
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-desktop ros-rviz', '', 'desktop', d)}"

# NB. gazebo-msgs is a dependency of non-Gazebo packages, so it doesn't appear here.
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-gazebo', '', 'gazebo-rosdev', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-gazebo', '', 'gazebo-plugins', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-gazebo', '', 'gazebo-ros', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-gazebo', '', 'gazebo-ros-pkgs', d)}"

# MRPT requires the "opengl" distro feature.
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-mrpt opengl', '', 'mrpt2', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-mrpt opengl', '', 'wxpython', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-mrpt opengl', '', 'wxwidgets', d)}"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-realsense', '', 'librealsense2', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-realsense', '', 'realsense-camera-msgs', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-realsense', '', 'realsense-ros2-camera', d)}"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt', '', 'python-qt-binding', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt', '', 'qt-dotgraph', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt', '', 'qt-gui', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt', '', 'qt-gui-app', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt', '', 'qt-gui-core', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt', '', 'qt-gui-cpp', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt', '', 'qt-gui-py-common', d)}"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-action', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-console', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-graph', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-gui', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-gui-cpp', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-gui-py', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-image-view', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-msg', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-plot', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-publisher', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-py-common', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-py-console', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-service-caller', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-shell', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-srv', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-top', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-topic', d)}"

# RViz requires the "opengl" distro feature.
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'object-analytics-rviz', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'rviz-assimp-vendor', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'rviz-common', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'rviz-default-plugins', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'rviz-ogre-vendor', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'rviz-rendering', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'rviz-rendering', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'rviz-rendering-tests', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'rviz-visual-testing-framework', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'rviz2', d)}"
