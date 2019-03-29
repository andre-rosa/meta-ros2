# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "RTAB-Map's ros-pkg. RTAB-Map is a RGB-D SLAM approach with real-time constraints."
AUTHOR = "Mathieu Labbe <matlabbe@gmail.com>"
ROS_AUTHOR = "Mathieu Labbe"
HOMEPAGE = "https://github.com/introlab/rtabmap_ros/issues"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rtabmap_ros"
ROS_BPN = "rtabmap_ros"

ROS_BUILD_DEPENDS = " \
    class-loader \
    costmap-2d \
    cv-bridge \
    dynamic-reconfigure \
    eigen-conversions \
    find-object-2d \
    geometry-msgs \
    image-geometry \
    image-transport \
    laser-geometry \
    message-filters \
    message-generation \
    move-base-msgs \
    nav-msgs \
    nodelet \
    octomap-msgs \
    pcl \
    pcl-conversions \
    pcl-ros \
    roscpp \
    rospy \
    rtabmap \
    rviz \
    sensor-msgs \
    std-msgs \
    std-srvs \
    stereo-msgs \
    tf \
    tf-conversions \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    genmsg-native \
"

ROS_EXPORT_DEPENDS = " \
    class-loader \
    compressed-depth-image-transport \
    compressed-image-transport \
    costmap-2d \
    cv-bridge \
    dynamic-reconfigure \
    eigen-conversions \
    find-object-2d \
    geometry-msgs \
    image-geometry \
    image-transport \
    laser-geometry \
    message-filters \
    message-runtime \
    move-base-msgs \
    nav-msgs \
    nodelet \
    octomap-msgs \
    pcl-conversions \
    pcl-ros \
    roscpp \
    rospy \
    rtabmap \
    rviz \
    sensor-msgs \
    std-msgs \
    std-srvs \
    stereo-msgs \
    tf \
    tf-conversions \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    class-loader \
    compressed-depth-image-transport \
    compressed-image-transport \
    costmap-2d \
    cv-bridge \
    dynamic-reconfigure \
    eigen-conversions \
    find-object-2d \
    geometry-msgs \
    image-geometry \
    image-transport \
    laser-geometry \
    message-filters \
    message-runtime \
    move-base-msgs \
    nav-msgs \
    nodelet \
    octomap-msgs \
    pcl-conversions \
    pcl-ros \
    roscpp \
    rospy \
    rtabmap \
    rviz \
    sensor-msgs \
    std-msgs \
    std-srvs \
    stereo-msgs \
    tf \
    tf-conversions \
    tf2-ros \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/introlab/rtabmap_ros-release/archive/release/melodic/rtabmap_ros/0.17.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "fa3b3cd11942e35737972621f86557bd"
SRC_URI[sha256sum] = "6fe815c03b7ab3c27db125908e1206c537a46da0ff6266bb0263315833c81c6a"
S = "${WORKDIR}/rtabmap_ros-release-release-melodic-rtabmap_ros-0.17.6-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rtabmap-ros', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rtabmap-ros', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rtabmap-ros/rtabmap-ros_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rtabmap-ros/rtabmap-ros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rtabmap-ros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rtabmap-ros/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}