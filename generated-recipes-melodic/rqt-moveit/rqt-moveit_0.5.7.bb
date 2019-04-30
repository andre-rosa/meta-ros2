# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An rqt-based tool that assists monitoring tasks    for <a href="http://ros.org/wiki/moveit">MoveIt!</a> motion planner    developers and users. Currently the following items are monitored if they    are either running, existing or published:    <ul>    <li>Node: /move_group</li>    <li>Parameter: [/robot_description, /robot_description_semantic]</li>    <li>Topic: Following types are monitored. Published &quot;names&quot; are ignored.<br/>        [sensor_msgs/PointCloud, sensor_msgs/PointCloud2,         sensor_msgs/Image, sensor_msgs/CameraInfo]</li>    </ul>    Since this package is not made by the MoveIt! development team (although with    assistance from the them), please post issue reports to the designated    tracker (not MoveIt!'s main tracker)."
AUTHOR = "Isaac I.Y. Saito <iisaito@kinugarage.com>"
HOMEPAGE = "http://wiki.ros.org/rqt_moveit"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=26;endline=26;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    python-qt-binding \
    rosnode \
    rospy \
    rostopic \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
    rqt-topic \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-qt-binding \
    rosnode \
    rospy \
    rostopic \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
    rqt-topic \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/rqt_moveit-release/archive/release/melodic/rqt_moveit/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a3a14bb70eccd5175c40c910a1e2b3d5"
SRC_URI[sha256sum] = "979c1ec400699c3597ee3bc9044aeab021f3cbb79bdf2edfe7572c0ee7a96f96"
S = "${WORKDIR}/rqt_moveit-release-release-melodic-rqt_moveit-0.5.7-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rqt-moveit/rqt-moveit_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rqt-moveit/rqt-moveit_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-moveit/rqt-moveit-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-moveit/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-moveit/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
