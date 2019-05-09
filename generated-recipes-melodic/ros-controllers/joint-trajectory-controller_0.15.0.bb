# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Controller for executing joint-space trajectories on a group of joints."
AUTHOR = "Bence Magyar <bence.magyar.robotics@gmail.com>"
ROS_AUTHOR = "Adolfo Rodriguez Tsouroukdissian"
HOMEPAGE = "https://github.com/ros-controls/ros_controllers/wiki"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_controllers"
ROS_BPN = "joint_trajectory_controller"

ROS_BUILD_DEPENDS = " \
    actionlib \
    angles \
    cmake-modules \
    control-msgs \
    control-toolbox \
    controller-interface \
    hardware-interface \
    realtime-tools \
    roscpp \
    trajectory-msgs \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    angles \
    control-msgs \
    control-toolbox \
    controller-interface \
    hardware-interface \
    realtime-tools \
    roscpp \
    trajectory-msgs \
    urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    angles \
    control-msgs \
    control-toolbox \
    controller-interface \
    hardware-interface \
    realtime-tools \
    roscpp \
    trajectory-msgs \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    controller-manager \
    rostest \
    xacro \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/joint_trajectory_controller/0.15.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "05a70fa119fa4252b17de25abe549aef"
SRC_URI[sha256sum] = "d7624bbbca732b5e17524908ec9e6214c448aa9cc33ffddb3538e9269c6bd313"
S = "${WORKDIR}/ros_controllers-release-release-melodic-joint_trajectory_controller-0.15.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('ros-controllers', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('ros-controllers', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-controllers/ros-controllers_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-controllers/ros-controllers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-controllers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-controllers/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
