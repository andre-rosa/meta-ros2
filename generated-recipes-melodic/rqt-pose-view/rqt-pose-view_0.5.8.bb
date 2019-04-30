# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_pose_view provides a GUI plugin for visualizing 3D poses."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "http://wiki.ros.org/rqt_pose_view"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    gl-dependency \
    python-opengl \
    python-qt-binding \
    python-rospkg \
    rospy \
    rostopic \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    gl-dependency \
    python-opengl \
    python-qt-binding \
    python-rospkg \
    rospy \
    rostopic \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/rqt_pose_view-release/archive/release/melodic/rqt_pose_view/0.5.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f0a3b526ff8475b1354318a6095def9d"
SRC_URI[sha256sum] = "00e9962e4a7132dcb9082692fb49563d309b9e446b5eb17e65354dd7e1e24e4d"
S = "${WORKDIR}/rqt_pose_view-release-release-melodic-rqt_pose_view-0.5.8-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rqt-pose-view/rqt-pose-view_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rqt-pose-view/rqt-pose-view_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-pose-view/rqt-pose-view-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-pose-view/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-pose-view/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
